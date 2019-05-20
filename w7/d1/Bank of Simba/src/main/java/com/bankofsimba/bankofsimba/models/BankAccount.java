package com.bankofsimba.bankofsimba.models;


import java.text.DecimalFormat;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;

    DecimalFormat decimalFormat = new DecimalFormat("#.00");
    private String balanceString;

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balanceString = decimalFormat.format(balance);
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBalanceString() {
        return balanceString;
    }

    public void setBalanceString(String balanceString) {
        this.balanceString = balanceString;
    }
}