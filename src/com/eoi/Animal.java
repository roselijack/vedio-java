package com.eoi;

public class Animal {
    private String name;
    private int brain;
    private int leg;
    private int tail;

    public Animal(String name, int brain, int leg, int tail) {
        this.name = name;
        this.brain = brain;
        this.leg = leg;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    protected void eat()
    {
        System.out.println("animal.eat() is called");
    }
}
