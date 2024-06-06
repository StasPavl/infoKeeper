package com.pavl.controller;

import com.pavl.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/database")
public class DataBaseController {
    private final PersonService personService;

    public DataBaseController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/all")
    public String showAll(Model model){
        model.addAttribute("persons",personService.findAll());
        return "/database/main-database";
    }
}
