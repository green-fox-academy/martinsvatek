package com.thereddit.demo.controllers;

import com.thereddit.demo.models.User;
import com.thereddit.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // just saying which class is controller
public class MainController {

    @Autowired
    private UserRepository usersRepo;

    @GetMapping(value = {"", "/", "/login"})
    public String login(Model model) {
        return "login";
    }

    @PostMapping(value = {"", "/", "/login"})
    public String userCreated(@RequestParam(value = "username") String username,
                              @RequestParam(value = "password") String password,
                              Model model) {

        User testedUser = usersRepo.findByUsername(username);
        if(testedUser == null) {
            return "login";
        } else {
            if(password.equals(testedUser.getPassword())) {
                return "index";
            } else {
                return "login";
            }
        }
    }

    @GetMapping(value = "/registration")
    public String registration(Model model) {
        return "registration";
    }

    @PostMapping(value = "/registration")
    public String userRegistered(@RequestParam(value = "username") String username,
                              @RequestParam(value = "password") String password,
                              Model model) {
        usersRepo.save(new User(username, password));
        return "index";
    }
}