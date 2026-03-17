package com.opito.tareacompunet2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opito.tareacompunet2.model.Question;
import com.opito.tareacompunet2.repository.QuestionRepository;
import com.opito.tareacompunet2.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question findById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public Question save(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question update(Long id, Question question) {
        return questionRepository.save(question);
    }

    @Override
    public void deleteById(Long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public List<Question> findByType(String type) {
        return questionRepository.findByType(type);
    }

    @Override
    public List<Question> findAllBySurvey(Long id){
        return questionRepository.findBySectionSurveyId(id);
    }

}
