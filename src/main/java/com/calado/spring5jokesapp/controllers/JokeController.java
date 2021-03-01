package com.calado.spring5jokesapp.controllers;

import com.calado.spring5jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Author: joaqu
 * Date:   2021-02-28
 */
@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getBooks(Model model){

        model.addAttribute("joke", jokeService.getQuote());
        return "index";
    }
}
