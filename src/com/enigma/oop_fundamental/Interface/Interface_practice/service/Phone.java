package com.enigma.oop_fundamental.Interface.Interface_practice.service;

public interface Phone {
    int maxVolume = 100;
    int minVolume = 0;

    void powerOn();
    void powerOff();

    void volumeUp();
    void volumeDown();
}
