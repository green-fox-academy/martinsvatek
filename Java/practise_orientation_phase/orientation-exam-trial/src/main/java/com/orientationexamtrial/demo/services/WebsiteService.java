package com.orientationexamtrial.demo.services;


import com.orientationexamtrial.demo.models.Website;
import javassist.NotFoundException;

public interface WebsiteService {
    Website save(Website link);

    Website findByAlias(String alias);

    Iterable<Website> getEveryLink();

    void deleteLink(long id, String secretCode) throws NotFoundException;
}