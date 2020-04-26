package com.eoi;

public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        this.health = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage)
    {
        this.health = this.health -damage;
        if(this.health <0)
        {
            System.out.println("knocked out!");
        }

    }

    public int getHealth() {
        return health;
    }
}
