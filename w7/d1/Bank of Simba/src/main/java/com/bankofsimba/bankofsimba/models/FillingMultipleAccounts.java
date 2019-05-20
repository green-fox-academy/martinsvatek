package com.bankofsimba.bankofsimba.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FillingMultipleAccounts {

    private List<BankAccount> bankAccountList;

    // shorter constructor

/*  public FillingMultipleAccounts() {
        this.bankAccountList = Arrays.asList(
                new BankAccount("Simba", 2000, "Lion"),
                new BankAccount("Scar", 4500, "Lion"),
                new BankAccount("Pumbaa", 1200, "Wild Pig"),
                new BankAccount("Timon", 800, "Surikata"),
                new BankAccount("Shenzi", 310, "Hyena"));
    } */

    // nicer constructor

    public FillingMultipleAccounts() {
        initializeList();
    }

    public void initializeList() {
        this.bankAccountList = new ArrayList<>();

        BankAccount simba = new BankAccount("Simba", 2000, "Lion");
        BankAccount scar = new BankAccount("Scar", 4500, "Lion");
        BankAccount pumbaa = new BankAccount("Pumbaa", 1200, "Wild Pig");
        BankAccount timon = new BankAccount("Timon", 800, "Surikata");
        BankAccount shenzi = new BankAccount("Shenzi", 310, "Hyena");

        bankAccountList.add(simba);
        bankAccountList.add(scar);
        bankAccountList.add(pumbaa);
        bankAccountList.add(timon);
        bankAccountList.add(shenzi);
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }
}