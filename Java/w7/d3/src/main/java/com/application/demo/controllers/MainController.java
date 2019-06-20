package com.application.demo.controllers;

import com.application.demo.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    UtilityService myUtilityService;

    @GetMapping("/useful")
    public String openUsefulPage() {
        return "index";
    }

    @GetMapping("/useful/colored")
    public String openColoredPage(Model model) {
        model.addAttribute("backgroundColor", "background-color:" + myUtilityService.randomColor());
        return "coloredPage";
    }

    @GetMapping("/useful/email")
    public String validateEmail(Model model, @RequestParam String validatedEmailAddress) {
        model.addAttribute("validatedEmailAddress", myUtilityService.validateEmail(validatedEmailAddress));
        model.addAttribute("emailAddress", validatedEmailAddress);
        return "emailValidation";
    }

    @GetMapping("/useful/code")
    public String caesarCoding(Model model, @RequestParam String code,@RequestParam int number) {
        model.addAttribute("code", myUtilityService.caesar(code, number));
        return "codingAndDecoding";
    }
}