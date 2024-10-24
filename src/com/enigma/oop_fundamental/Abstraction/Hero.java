package com.enigma.oop_fundamental.Abstraction;

public class Hero extends Character {

    public Hero(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    @Override
    public void attack(Character target) {
        target.getDamage(this.damage);
    }
}
