package com.enigma.oop_fundamental.Inheritance;

public class InheritanceApp {
    public static void main(String[] args) {
        Cat cat = new Cat("michi");
        Bird bird = new Bird("pororo");

        System.out.println(cat.name);
        cat.eat();
        cat.moving();
        cat.sleep();

        System.out.println(bird.name);
        bird.eat();
        bird.moving();
        bird.sleep();

    }
}
