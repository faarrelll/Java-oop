package com.enigma.oop_fundamental.object_interaction;

public class Hero {
    private String name, role;
    private int hp, attack, defense;

    public Hero(String name, String role) {
        this.name = name;
        this.role = role;
        setHp(role);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(String role) {
        if (role.equalsIgnoreCase("marksman")){
            hp = 1000;
        } else if (role.equalsIgnoreCase("assasin")){
            hp = 1500;
        } else if (role.equalsIgnoreCase("fighter")){
            hp = 2500;
        } else if (role.equalsIgnoreCase("mage")){
            hp = 1100;
        } else if (role.equalsIgnoreCase("Tank")) {
            hp = 5000;
        } else {
            System.out.println("role tidak ada                                                                                                          ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
