package com.foxclub.demo.controllers;

import com.foxclub.demo.models.Fox;
import com.foxclub.demo.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    FoxService foxService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String serveLoginForm() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLoginForm(@RequestParam String petName, Model model) {
        // add fox
        model.addAttribute("petName", petName);

        Fox newFox = new Fox(petName);

        this.foxService.addFox(newFox);

        return "redirect:/list";
    }
}
