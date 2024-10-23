package com.enigma.oop_fundamental;

public class Main {
    public static void main(String[] args) {
        /*
        Class -> adalah blueprint dari object.
        Object -> representasi/implementasi dari class
         */

        Car yaris = new Car("Yaris");
        Car civic = new Car("sport","civic","white");

        civic.startEngine();
        yaris.startEngine();

        System.out.println(civic.name);
        System.out.println(yaris.name);

    }
}
