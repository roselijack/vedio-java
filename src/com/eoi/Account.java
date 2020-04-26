package com.eoi;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    public Account()
    {

        this("1234", 100,"rose","tianzijiaozi","1881827345");
        System.out.println("default constructor is called");

    }

    public Account(String number, double balance, String customerName, String customerAddress, String customerPhone)
    {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerAddress;
        System.out.println("the constructor with parameter is called");
    }

    public double withdraw(double money)
    {
        if(money<=this.balance)
        {
            balance-=money;

        }
        else
        {
            System.out.println("you don't have "+money+"avaliable");

        }
        return balance;
    }

    public double deposit(double money)
    {
        balance+=money;
        return balance;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
