package com.enigma.oop_fundamental.Encapsulation.Game;

import java.util.Random;

public class Computer {
    final private int secretNumber;

    public Computer(){
        secretNumber = generateSecretNumber();
    }

    public int getSecretNumber() {
        return secretNumber;
    }
    private int generateSecretNumber(){
        Random random = new Random();
        return random.nextInt(10);
    }
}
