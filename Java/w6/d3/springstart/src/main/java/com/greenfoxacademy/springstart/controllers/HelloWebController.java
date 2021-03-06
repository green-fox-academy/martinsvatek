package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam String name, Model model) {
        Greeting greet = new Greeting("");
        model.addAttribute("name", greet.getRandomHello());
        model.addAttribute("style", greet.getRandomStyle());
        model.addAttribute("counter", greet.getId());
        return "greeting"; // access to "html"
    }
}
