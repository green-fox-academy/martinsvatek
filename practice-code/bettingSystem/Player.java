package bettingSystem;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name; // string, the name of the player
    private int account; // an integer, it represents the amount of money the player has
    private List<Bet> bets; // a Bet list which stores the bets made by the player

    public Player() {
        bets = new ArrayList<>();
    }

    // it makes a bet with the given amount of money and the given contestant
    // store the bet in the bets list if the player has enough money to make the bet
    // if the player does not have sufficient amount of money just ignore the bet

    public void makeBet(Contestant contestant, int amount) {

        if (account >= amount) {
            bets.add(new Bet(contestant, amount));
        }
    }

    public List<Bet> getBets() {
        return bets;
    }
}