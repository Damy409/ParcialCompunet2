package com.opito.tareacompunet2.repository;


import com.opito.tareacompunet2.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    // Obtener todas las preguntas de un tipo específico (por ejemplo, todas las preguntas de tipo "multiple choice").
    List<Question> findByType(String type);

    // Obtener preguntas de una encuesta
    List<Question> findBySectionSurveyId(Long surveyId);

    // Entender como funciona cada una de las consultas para poderlas hacer y hacer bien la union
    // Aparte de entender como funciona las relaciones uno a muchos y muchos a uno 



}
