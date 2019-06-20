package com.orientationexamtrial.demo.controllers;

import com.orientationexamtrial.demo.models.Website;
import com.orientationexamtrial.demo.services.WebsiteService;
import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebsiteApiController {

    private WebsiteService websiteService;

    public WebsiteApiController(WebsiteService websiteService) {
        this.websiteService = websiteService;
    }

    @GetMapping("/api/links")
    public Iterable<Website> getLinks() {
        return websiteService.getEveryLink();
    }

    @DeleteMapping("/api/links/{id}")
    public ResponseEntity delete(@PathVariable long id, @RequestBody SecretCodeInput secretCodeInput) {
        try {
            websiteService.deleteLink(id, secretCodeInput.secretCode);
        } catch (NotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        return ResponseEntity.noContent().build();
    }

    static class SecretCodeInput {
        public String secretCode;
    }
}