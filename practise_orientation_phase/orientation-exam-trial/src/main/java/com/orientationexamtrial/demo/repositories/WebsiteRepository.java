package com.orientationexamtrial.demo.repositories;

import com.orientationexamtrial.demo.models.Website;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WebsiteRepository extends CrudRepository<Website, Long> {

    Website findByAlias(String alias);

    List<Website> findAll();
}
