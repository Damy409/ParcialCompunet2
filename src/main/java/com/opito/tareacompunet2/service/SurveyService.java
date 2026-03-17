package com.opito.tareacompunet2.service;

import java.util.List;
import com.opito.tareacompunet2.model.Survey;

public interface SurveyService {

    List<Survey> findAll();

    Survey findById(Long id);

    Survey save(Survey survey);

    Survey update(Long id, Survey survey);

    void deleteById(Long id);

    List<Survey> searchByName(String name);

}
