package com.foxclub.demo.services;

import com.foxclub.demo.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoxService {
    private List<Fox> foxes = new ArrayList<>();

    public void addFox(Fox fox) {
        this.foxes.add(fox);
    }

    public Optional<Fox> findFoxByName(String name) {
        return this.foxes.stream().filter((Fox fox) -> {
            return fox.getName().equals(name);
        }).findFirst();
    }

    public List<Fox> getFoxes() {
        return this.foxes;
    }
}