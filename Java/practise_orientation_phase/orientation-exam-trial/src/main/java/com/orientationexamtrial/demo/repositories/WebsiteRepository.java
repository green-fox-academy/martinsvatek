package com.orientationexamtrial.demo.repositories;

import com.orientationexamtrial.demo.models.Website;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface WebsiteRepository extends CrudRepository<Website, Long> {

    Optional<Website> findByAlias(String alias);
}