package com.company;

public class Hero {
    double damage;
    int health;
    String superPowers;
    public Hero(int health, double damage, String superPowers){
        this.health=health;
        this.superPowers=superPowers;
    }
    public Hero(int health, double dam){
        this.health=health ;
        damage = dam;

    }

    public double getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getSuperPowers() {
        return superPowers;
    }
}
