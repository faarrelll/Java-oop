package com.enigma.oop_fundamental.Inheritance;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name+" is eating..");
    }

    @Override
    public void sleep() {
        System.out.println(name+" is Sleeping..");
    }

    @Override
    public void moving() {
        System.out.println(name+" is moving..");
    }
}
