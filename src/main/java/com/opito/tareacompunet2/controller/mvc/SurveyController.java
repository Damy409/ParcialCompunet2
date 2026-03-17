package com.opito.tareacompunet2.controller.mvc;


import com.opito.tareacompunet2.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/surveys")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;


    // Obtener todas las encuestas
    @GetMapping
    public String findAll(Model model){

        model.addAttribute("surveys", surveyService.findAll());

        return "surveys/list";
    }

    // Buscar encuestas por nombre
    @GetMapping("/search")
    public String searchSurvey(@RequestParam String name, Model model){

        model.addAttribute("surveys", surveyService.searchByName(name));

        return "surveys/list";
    }

}
