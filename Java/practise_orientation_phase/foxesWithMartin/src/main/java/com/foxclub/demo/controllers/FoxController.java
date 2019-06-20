package com.foxclub.demo.controllers;

import com.foxclub.demo.models.Fox;
import com.foxclub.demo.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class FoxController {

    @Autowired
    FoxService foxService;

    @RequestMapping("/")
    public String handleShowFox(@RequestParam String name, Model model) {
//        model.addAttribute("fox", fox);

        Optional<Fox> maybeFox = this.foxService.findFoxByName(name);

        if (maybeFox.isPresent()) {
            model.addAttribute("fox", maybeFox.get());
        } else {
            model.addAttribute("error", "could not find fox with name " + name);
        }

        return "index";
    }

    @RequestMapping("/list")
    public String handleList(Model model) {
        model.addAttribute("foxes", this.foxService.getFoxes());

        return "list";
    }
}