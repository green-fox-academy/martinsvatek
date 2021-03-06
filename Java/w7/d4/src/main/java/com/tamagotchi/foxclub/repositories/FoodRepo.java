package com.tamagotchi.foxclub.repositories;

import com.tamagotchi.foxclub.models.Food;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodRepo extends CrudRepository<Food, Long> {

    @Override
    List<Food> findAll();
}