package com.tamagotchi.foxclub.repositories;

import com.tamagotchi.foxclub.models.Fox;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoxRepo extends CrudRepository<Fox, Long> {

    Fox findFoxByName(String name);

    @Override
    List<Fox> findAll();
}