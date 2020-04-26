package com.eoi;

public class Cat {
    private static String name;

    public Cat(String name) {
        Cat.name = name;
    }

    public void printName()
    {
        System.out.println("name:"+Cat.name);
    }
}

