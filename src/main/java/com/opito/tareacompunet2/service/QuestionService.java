package com.opito.tareacompunet2.service;


import java.util.List;
import com.opito.tareacompunet2.model.Question;

public interface QuestionService {

    List<Question> findAll();

    Question findById(Long id);

    Question save(Question question);

    Question update(Long id, Question question);

    void deleteById(Long id);

    List<Question> findByType(String type);


    List<Question> findAllBySurvey(Long id);
}