package com.tamagotchi.foxclub.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping(value = "/")
    public String index() {
        return "login";
    }

    @GetMapping(value = "/login")
    public String showLoginPage() {
        return "login";
    }
}
