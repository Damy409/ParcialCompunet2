package com.opito.tareacompunet2.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opito.tareacompunet2.model.Survey;
import com.opito.tareacompunet2.repository.SurveyRepository;
import com.opito.tareacompunet2.service.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService {

    @Autowired
    private  SurveyRepository surveyRepository;


    @Override
    public List<Survey> findAll() {
        return surveyRepository.findAll();
    }

    @Override
    public Survey findById(Long id) {
        return surveyRepository.findById(id).orElse(null);
    }

    @Override
    public Survey save(Survey survey) {
        return surveyRepository.save(survey);
    }

    @Override
    public Survey update(Long id, Survey survey) {

        /* Survey existing = surveyRepository.findById(id).orElse(null);

        if(existing != null){
            existing.setName(survey.html.getName());
            return surveyRepository.save(existing);
        }
*/
        return null;
    }

    @Override
    public void deleteById(Long id) {
        surveyRepository.deleteById(id);
    }

    @Override
    public List<Survey> searchByName(String name) {
        return surveyRepository.findByNameContaining(name);
    }

}
