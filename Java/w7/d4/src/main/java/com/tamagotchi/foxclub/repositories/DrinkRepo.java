package com.tamagotchi.foxclub.repositories;

import com.tamagotchi.foxclub.models.Drink;
import org.springframework.data.repository.CrudRepository;

public interface DrinkRepo extends CrudRepository<Drink, Long> {
}