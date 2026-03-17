package com.opito.tareacompunet2.controller.mvc;


import com.opito.tareacompunet2.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private  QuestionService questionService;


    // Preguntas por tipo
    @GetMapping("/type/{type}")
    public String questionsByType(@PathVariable String type, Model model){

        model.addAttribute("questions",
                questionService.findByType(type));

        return "questions/list";
    }

    @GetMapping("/survey/{surveyid}")
    public String questionsBySurvey(@PathVariable Long surveyid, Model model){
        model.addAttribute("questions", questionService.findAllBySurvey(surveyid));
        return "questions/survey";
    }

}
