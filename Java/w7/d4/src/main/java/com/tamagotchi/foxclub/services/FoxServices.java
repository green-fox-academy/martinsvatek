package com.tamagotchi.foxclub.services;

import com.tamagotchi.foxclub.models.Fox;

import java.util.List;

public interface FoxServices {
    Fox getFox(String name);
    void add(Fox fox);
    void delete(Fox fox);
    void updateFox(Fox oldFox, Fox newFox);
    List<String> listAll();
}