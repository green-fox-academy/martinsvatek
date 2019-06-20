package com.orientationexamtrial.demo.services;

import com.orientationexamtrial.demo.models.Website;
import com.orientationexamtrial.demo.repositories.WebsiteRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class WebsiteServiceImpl implements WebsiteService {

    private WebsiteRepository websiteRepo;

    public WebsiteServiceImpl(WebsiteRepository websiteRepo) {
        this.websiteRepo = websiteRepo;
    }

    @Override
    public Website save(Website website) {
        if (aliasExists(website.getAlias())) {
            throw new IllegalArgumentException("Alias already in use!");
        }

        String secretCode = generateSecretCode();

        website.setSecretCode(secretCode);

        websiteRepo.save(website);

        return website;
    }

    @Override
    public Website findByAlias(String alias) {
        Optional<Website> optionalLink = websiteRepo.findByAlias(alias);

        if (optionalLink.isPresent()) {
            Website website = optionalLink.get();

            incrementHitCount(website);

            return website;
        }

        return null;
    }

    private void incrementHitCount(Website website) {
        website.setHitCount(website.getHitCount() + 1);

        websiteRepo.save(website);
    }

    @Override
    public Iterable<Website> getEveryLink() {
        return websiteRepo.findAll();
    }

    @Override
    public void deleteLink(long id, String secretCode) throws NotFoundException {
        Optional<Website> optionalLink = websiteRepo.findById(id);

        if (!optionalLink.isPresent()) {
            throw new NotFoundException("link was not found");
        }

        Website website = optionalLink.get();

        if (website.getSecretCode().equals(secretCode)) {
            websiteRepo.deleteById(id);

            return;
        }

        throw new IllegalArgumentException("Secret code is not valid");
    }

    private boolean aliasExists(String alias) {
        Optional<Website> optionalLink = websiteRepo.findByAlias(alias);

        return optionalLink.isPresent();
    }

    private String generateSecretCode() {
        String secretCode = "";
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int digit = random.nextInt(9);

            secretCode += digit;
        }

        return secretCode;
    }
}