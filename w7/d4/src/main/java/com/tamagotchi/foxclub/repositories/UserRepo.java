package com.tamagotchi.foxclub.repositories;

import com.tamagotchi.foxclub.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}