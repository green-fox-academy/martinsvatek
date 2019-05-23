package com.bankofsimba.bankofsimba.controllers;

import com.bankofsimba.bankofsimba.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {

    List users = new Users().getListOfUsers();

    @RequestMapping("/users")
    public String showAccountUsers(Model model) {
        model.addAttribute("users", users);
        return "users";
    }
}