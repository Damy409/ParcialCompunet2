package com.opito.tareacompunet2.repository;


import com.opito.tareacompunet2.model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterviewRepository extends JpaRepository<Interview, Long> {

    // Obtener todas los resultados de una encuesta ordenadas por fecha
    List<Interview> findBySurveyIdOrderByTimeStart(Long surveyId);

    // Obtener la primera entrevista realizada para una encuesta específica.
    Interview findFirstBySurveyIdOrderByTimeStartAsc(Long surveyId);

    // Obtener el número total de entrevistas realizadas para cada encuesta.
    long countBySurveyId(Long surveyId);

    // Existe entrevista por entrevistador
    boolean existsByInterviewerId(Integer interviewerId);

}