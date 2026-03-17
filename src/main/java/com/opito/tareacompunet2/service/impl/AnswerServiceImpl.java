package com.opito.tareacompunet2.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.opito.tareacompunet2.model.Answer;
import com.opito.tareacompunet2.repository.AnswerRepository;
import com.opito.tareacompunet2.service.AnswerService;

@Service  // <- muy importante
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerServiceImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public List<Answer> findAll() {
        return answerRepository.findAll();
    }

    @Override
    public Answer findById(Long id) {
        return answerRepository.findById(id).orElse(null);
    }

    @Override
    public Answer save(Answer answer) {
        return answerRepository.save(answer);
    }

    @Override
    public Answer update(Long id, Answer answer) {
        /* Answer existing = answerRepository.findById(id).orElse(null);
        if(existing != null){
            existing.setAnswer(answer.getAnswer());
            existing.setInterview(answer.getInterview());
            existing.setQuestion(answer.getQuestion());
            return answerRepository.save(existing);
        }*/
        return null;

    }

    @Override
    public void deleteById(Long id) {
        answerRepository.deleteById(id);
    }

    @Override
    public List<Answer> answersByInterview(Long interviewId) {
        return answerRepository.findByInterviewId(interviewId);
    }

    @Override
    public List<Answer> answersByQuestion(Long questionId) {
        return answerRepository.findByQuestionId(questionId);
    }
}
