package com.opito.tareacompunet2.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.opito.tareacompunet2.model.Interview;
import com.opito.tareacompunet2.repository.InterviewRepository;
import com.opito.tareacompunet2.service.InterviewService;

@Service
public class InterviewServiceImpl implements InterviewService {

    private final InterviewRepository interviewRepository;

    public InterviewServiceImpl(InterviewRepository interviewRepository) {
        this.interviewRepository = interviewRepository;
    }

    @Override
    public List<Interview> findAll() {
        return interviewRepository.findAll();
    }

    @Override
    public Interview findById(Long id) {
        return interviewRepository.findById(id).orElse(null);
    }

    @Override
    public Interview save(Interview interview) {
        return interviewRepository.save(interview);
    }

    @Override
    public Interview update(Long id, Interview interview) {
        return interviewRepository.save(interview);
    }

    @Override
    public void deleteById(Long id) {
        interviewRepository.deleteById(id);
    }

    @Override
    public List<Interview> interviewsBySurvey(Long surveyId) {
        return interviewRepository.findBySurveyIdOrderByTimeStart(surveyId);
    }

    @Override
    public Interview firstInterview(Long surveyId) {
        return interviewRepository.findFirstBySurveyIdOrderByTimeStartAsc(surveyId);
    }

    @Override
    public long totalInterviews(Long surveyId) {
        return interviewRepository.countBySurveyId(surveyId);
    }

}