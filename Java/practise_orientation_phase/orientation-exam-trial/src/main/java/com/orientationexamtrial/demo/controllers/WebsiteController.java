package com.orientationexamtrial.demo.controllers;

import com.orientationexamtrial.demo.models.Website;
import com.orientationexamtrial.demo.services.WebsiteService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebsiteController {

    WebsiteService websiteService;

    public WebsiteController(WebsiteService websiteService) { // good to use only one constructor for controller, not necessary to use @Autowired
        this.websiteService = websiteService;
    }

    @GetMapping("/")
    public String homepage(@RequestParam(required = false) String secretCode,
                           @RequestParam(required = false) String alias,
                           @RequestParam(required = false) boolean error,
                           @RequestParam(required = false) String url,
                           Model model) {
        model.addAttribute("secretCode", secretCode);
        model.addAttribute("alias", alias);
        model.addAttribute("error", error);
        model.addAttribute("url", url);

        return "index";
    }

    @PostMapping("/save-link")
    public String save(Website link) {
        Website savedWebsite = null;
        try {
            savedWebsite = websiteService.save(link);
        } catch (IllegalArgumentException ex) {
            return "redirect:/?error=true" + "&url=" + link.getUrl() + "&alias=" + link.getAlias();
        }
        return "redirect:/?secretCode=" + savedWebsite.getSecretCode() + "&alias=" + savedWebsite.getAlias();
    }

    @GetMapping("/a/{alias}")
    public String redirectToLink(@PathVariable String alias) {
        Website website = websiteService.findByAlias(alias);
        if (website == null) {
            throw new ResourceNotFoundException();
        }

        return "redirect:" + website.getUrl();
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public static class ResourceNotFoundException extends RuntimeException {
    }
}