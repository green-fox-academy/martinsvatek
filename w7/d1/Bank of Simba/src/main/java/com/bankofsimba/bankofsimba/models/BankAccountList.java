package com.bankofsimba.bankofsimba.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccountList {

    private List<BankAccount> bankAccountList;

    // shorter constructor

/*  public BankAccountList() {
        this.bankAccountList = Arrays.asList(
                new BankAccount("Simba", 2000, "Lion"),
                new BankAccount("Scar", 4500, "Lion"),
                new BankAccount("Pumbaa", 1200, "Wild Pig"),
                new BankAccount("Timon", 800, "Surikata"),
                new BankAccount("Shenzi", 310, "Hyena"));
    } */

    // nicer constructor

    public BankAccountList() {
        initializeList();
    }

    public List<BankAccount> initializeList() {
        this.bankAccountList = new ArrayList<>();

        BankAccount simba = new BankAccount("Simba", 2000, "Lion", true);
        BankAccount scar = new BankAccount("Scar", 4500, "Lion", true);
        BankAccount pumbaa = new BankAccount("Pumbaa", 1200, "Wild Pig", false);
        BankAccount timon = new BankAccount("Timon", 800, "Surikata", false);
        BankAccount shenzi = new BankAccount("Shenzi", 310, "Hyena", false);

        bankAccountList.add(simba);
        bankAccountList.add(scar);
        bankAccountList.add(pumbaa);
        bankAccountList.add(timon);
        bankAccountList.add(shenzi);

        return bankAccountList;
    }

      public List<BankAccount> getAll() {

        List<BankAccount> allItems = bankAccountList.stream()
                .collect(Collectors.toList());

        return allItems;
    }
}