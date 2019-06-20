package bettingSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Race {

    List<Contestant> contestants; // it will store all of the contestants attending the race
    List<Player> players; // it will store all of the players

    public Race() {
        contestants = new ArrayList<>();
        players = new ArrayList<>();
    }

    public void startRace() {

        List<Integer> positionsInRace = new ArrayList<>();

        for (int i = 0; i < contestants.size(); i++) {
            positionsInRace.add(i + 1);
        }

        Collections.shuffle(positionsInRace);
    }
}