package com.bankofsimba.bankofsimba.models;

import java.text.DecimalFormat;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    DecimalFormat decimalFormat = new DecimalFormat("#.00");
    private String balanceString;

    private boolean isKing;

    public BankAccount(String name, double balance, String animalType) { // basic constructor
        this.name = name;
        this.balanceString = decimalFormat.format(balance);
        this.animalType = animalType;
    }

    public BankAccount(String name, double balance, String animalType, boolean isKing) { // + king
        this(name, balance, animalType);
        this.isKing = isKing;
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getBalanceString() {
        return balanceString;
    }

    public boolean isKing() {
        return isKing;
    }
}