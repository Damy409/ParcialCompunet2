package com.opito.tareacompunet2.service;

import java.util.List;
import com.opito.tareacompunet2.model.Interview;

public interface InterviewService {

    List<Interview> findAll();

    Interview findById(Long id);

    Interview save(Interview interview);

    Interview update(Long id, Interview interview);

    void deleteById(Long id);

    List<Interview> interviewsBySurvey(Long surveyId);

    Interview firstInterview(Long surveyId);

    long totalInterviews(Long surveyId);

}
