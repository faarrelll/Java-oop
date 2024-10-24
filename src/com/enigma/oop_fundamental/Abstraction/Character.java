package com.enigma.oop_fundamental.Abstraction;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int damage;

    public Character(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    //abstract
    public abstract void attack(Character target);

    public void getDamage(int damage) {
        this.hp -= damage;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}
