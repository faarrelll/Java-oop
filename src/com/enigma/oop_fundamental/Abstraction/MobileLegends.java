package com.enigma.oop_fundamental.Abstraction;

public class MobileLegends {
    public static void main(String[] args) {
        Hero layla = new Marksman("layla",1500,200);
        Hero miya = new Marksman("miya",1300,250);
        Hero alucard = new Fighter("alucard",2500,130);
        Hero hylos = new Tank("hylos",50000,50);
        Hero ling = new Assasin("ling",1500,350);
        Hero alice = new Mage("alice",1000,400);
        Monster lord = new Lord("lord",15000,500);
        Monster turtle = new Turtle("turtle",10000,200);

        System.out.println(layla.getHp());
        System.out.println(miya.getHp());
        System.out.println(alucard.getHp());
        System.out.println(hylos.getHp());
        System.out.println(ling.getHp());
        System.out.println(lord.getHp());
        System.out.println(turtle.getHp());
        layla.attack(miya);
        miya.attack(layla);
        System.out.println(layla.getHp());
        System.out.println(miya.getHp());

    }
}
