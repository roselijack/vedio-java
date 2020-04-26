package com.eoi;

import java.util.ArrayList;

public class Customers {


    private String name;
    private ArrayList<Double> transaction;

    public Customers(String name, double transa) {
        this.name = name;
        this.transaction = transaction;
    }

    public void addTransaction(double amount)
    {
        this.transaction.add(amount);
    }
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
