package com.mirrket.chucknorriswords.controller;

import com.mirrket.chucknorriswords.service.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class JokesController {

    @Autowired
    Joke joke;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String jokeFromChuck(Model model){
        model.addAttribute("joke",joke.joke());
        return "chucknorris";
    }
}
