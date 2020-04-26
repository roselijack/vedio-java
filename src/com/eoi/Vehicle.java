package com.eoi;

public class Vehicle {
    private int steering;
    private int gear;
    public void move(int step)
    {
        System.out.println("move "+step+" steps");
    }

}

class Cara extends Vehicle
{

}

class benci extends Cara
{

}