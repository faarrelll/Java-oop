package com.enigma.oop_fundamental.Inheritance;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println("is Eating..");
    }
    public void sleep() {
        System.out.println("is Sleeping..");
    }
    public void moving() {
        System.out.println("is Moving..");
    }
}
