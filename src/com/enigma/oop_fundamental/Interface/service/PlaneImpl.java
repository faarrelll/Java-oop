package com.enigma.oop_fundamental.Interface.service;


public class PlaneImpl implements Fly, Vehicle {
    @Override
    public void flying() {
        System.out.println("Pesawat terbang...");
    }

    @Override
    public void engineStart() {
        System.out.println("Engine start...");
    }

    @Override
    public void move() {
        System.out.println("Plane moves...");
    }

}

