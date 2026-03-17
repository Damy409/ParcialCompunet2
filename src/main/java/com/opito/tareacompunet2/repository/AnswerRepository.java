package com.opito.tareacompunet2.repository;


import com.opito.tareacompunet2.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

    // Respuestas de una entrevista
    List<Answer> findByInterviewId(Long interviewId);

    // Respuestas de una pregunta
    List<Answer> findByQuestionId(Long questionId);

}