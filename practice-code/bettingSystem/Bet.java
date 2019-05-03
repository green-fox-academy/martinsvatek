package bettingSystem;

import java.util.Random;

public class Bet {

    private int betId; // a random number between 1000 - 9999
    private int amount; // an integer, it represents the amount of money made on the bet
    private Player player; // it represents the owner of the bet
    private Contestant contestant; // it represents the contestant the bet was made on

    public Bet(Contestant contestant, int amount) {

        Random random = new Random();

        betId = 1000 + random.nextInt(9000);
        this.amount = amount;
        this.player = player;
        this.contestant = contestant;
    }

    public int getBetId() {
        return betId;
    }

    public int getAmount() {
        return amount;
    }

    public Contestant getContestant() {
        return contestant;
    }
}