package com.example.hangman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String landingPage() {
        System.out.println("Home route");
        return "index";
    }

}
