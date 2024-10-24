package com.enigma.oop_fundamental.Interface.Interface_practice.serviceimpl;

import com.enigma.oop_fundamental.Interface.Interface_practice.service.Phone;

public class PhoneImpl implements Phone {
    private String name;
    private int volume;
    private boolean isOn;

    public PhoneImpl(String name) {
        this.name = name;
        this.volume = 0;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        if (isOn) {
            System.out.println("hp sudah menyala");
        } else {
            System.out.println("hp menyala");
        }
    }

    @Override
    public void powerOff() {
        if (isOn) {
            System.out.println("hp mati");
        } else {
            System.out.println("hp mati");
        }
    }

    @Override
    public void volumeUp() {
        if (volume < maxVolume) {
            volume += 10;
            System.out.println("volume sekarang "+volume);
        } else {
            System.out.println("Volume sudah maksimal");
        }
    }

    @Override
    public void volumeDown() {
        if (volume > minVolume) {
            volume -= 10;
            System.out.println("volume sekarang "+volume);
        } else {
            System.out.println("Volume sudah paling minimal");
        }
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }
}
