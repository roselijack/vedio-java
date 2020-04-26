package com.eoi;

public class Dog extends Animal {

        private int teeth;
    public Dog(String name, int brain, int leg, int tail,int teeth) {
        super("dog", 1, 4,tail);
        this.teeth = 20;
    }

    private void chew()
    {
        System.out.println("dog.chew() is called");
    }

    @Override
    public void eat() {

        System.out.println("dog.eat() is called");
        super.eat();
        chew();
    }


}
