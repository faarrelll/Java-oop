package com.enigma.oop_fundamental.Interface.serviceimpl;


import com.enigma.oop_fundamental.Interface.service.LandVehicle;

public class CarImpl implements LandVehicle {

    @Override
    public void fuel() {
        System.out.println("Please use pertamax");
    }

    @Override
    public void move() {
        System.out.println("Car is moving...");
    }
}

