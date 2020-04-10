package com.company;

public class Main {

    public static void main(String[] args) {
	Boss b=new Boss();
	b.setDamage(7.7);
	b.setHealth(9);
	b.setTypeOfProtection("Encodes");
        System.out.println(b.getDamage()+ " " + b.getHealth() + " " + b.getTypeOfProtection());
    }
}
