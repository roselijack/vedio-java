package com.eoi;

import java.util.ArrayList;

public class Branches {
    ArrayList<Customers> customers;
    public void addCustomers(String name, double tansac)
    {
        customers.add(new Customers(name,tansac));
    }

}
