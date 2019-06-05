package com.orientationexamtrial.demo.services;

import com.orientationexamtrial.demo.models.Website;
import com.orientationexamtrial.demo.repositories.WebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WebsiteService {

    private WebsiteRepository websiteRepo;

    public WebsiteService(WebsiteRepository websiteRepo) {
        this.websiteRepo = websiteRepo;
    }

    public Website createShortURL(String url, String alias) {
        if (websiteRepo.findByAlias(alias) == null) {
            Website newWebsite = new Website(url, alias); // create new website
            websiteRepo.save(newWebsite); // add new website to our repo
            return newWebsite;
        } else {
            return null;
        }
    }

    public Website findURLbyAlias(String alias) {
        return websiteRepo.findByAlias(alias);
    }

    public void increaseHitCount(String alias) {
        Website website = websiteRepo.findByAlias(alias);
        website.increaseHitCount();
        websiteRepo.save(website);
    }

    public List<Website> ListAllWebsites() {
        return websiteRepo.findAll();
    }

    public Optional<Website> findById(long id) {
        return websiteRepo.findById(id);
    }

    public void deleteById(long id) {
        websiteRepo.deleteById(id);
    }
}