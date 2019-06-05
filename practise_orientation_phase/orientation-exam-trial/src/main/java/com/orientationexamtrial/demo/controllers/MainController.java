package com.orientationexamtrial.demo.controllers;

import com.orientationexamtrial.demo.models.Website;
import com.orientationexamtrial.demo.services.WebsiteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    WebsiteService websiteService;

    public MainController(WebsiteService websiteService) { // good to use only one constructor for controller, not necessary to use @Autowired
        this.websiteService = websiteService;
    }

    @GetMapping("/")
    public String homepage() {
        return "index";
    }

    @PostMapping("/save-link")
    public String shortenURL(@RequestParam("url") String url,
                             @RequestParam("alias") String alias, Model model) {

        Website website = websiteService.createShortURL(url, alias);

        if (website != null) {
            model.addAttribute("website", website);
            return "index";
        } else {
            model.addAttribute("error", "Your alias is already in use!!!");
            return "index";
        }
    }
}