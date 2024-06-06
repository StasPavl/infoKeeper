package com.pavl.controller;

import com.pavl.dto.PersonDto;
import com.pavl.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/create")
    public String createPerson(Model model){
        model.addAttribute("person", new PersonDto());


        return "/person/create";
    }
    @PostMapping("/create")
    public String insertPerson(@Valid @ModelAttribute("person") PersonDto person, BindingResult bindingResult, Model model) {


        personService.save(person);

        return "redirect:/person/create";

    }
}
