package com.opito.tareacompunet2.controller.mvc;


import com.opito.tareacompunet2.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/answers")
public class AnswerController {


    @Autowired
    private  AnswerService answerService;


    // respuestas de una entrevista
    @GetMapping("/interview/{id}")
    public String answersByInterview(@PathVariable Long id, Model model){

        model.addAttribute("answers",
                answerService.answersByInterview(id));

        return "answers/list";
    }

}
