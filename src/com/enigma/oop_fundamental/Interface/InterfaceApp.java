package com.enigma.oop_fundamental.Interface;


import com.enigma.oop_fundamental.Interface.service.PlaneImpl;
import com.enigma.oop_fundamental.Interface.serviceimpl.MPVCarImpl;

public class InterfaceApp {
    public static void main(String[] args) {
        PlaneImpl plane = new PlaneImpl();
        plane.engineStart();
        plane.move();
        plane.flying();

        MPVCarImpl avanza = new MPVCarImpl();
        avanza.fuel();
        avanza.move();
    }
}
