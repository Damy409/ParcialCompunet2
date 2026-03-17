package com.opito.tareacompunet2.controller.mvc;


import com.opito.tareacompunet2.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/interviews")
public class InterviewController {

    @Autowired
    private InterviewService interviewService;


    // entrevistas de una encuesta
    @GetMapping("/survey/{id}")
    public String interviewsBySurvey(@PathVariable Long id, Model model){

        model.addAttribute("interviews",
                interviewService.interviewsBySurvey(id));

        return "interviews/list";
    }

    // primera entrevista
    @GetMapping("/first/{surveyId}")
    public String firstInterview(@PathVariable Long surveyId, Model model){

        model.addAttribute("interview",
                interviewService.firstInterview(surveyId));

        return "interviews/first";
    }

}
