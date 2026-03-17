package com.opito.tareacompunet2.service;


import java.util.List;
import com.opito.tareacompunet2.model.Answer;

public interface AnswerService {

    List<Answer> findAll();

    Answer findById(Long id);

    Answer save(Answer answer);

    Answer update(Long id, Answer answer);

    void deleteById(Long id);

    List<Answer> answersByInterview(Long interviewId);

    List<Answer> answersByQuestion(Long questionId);

}
