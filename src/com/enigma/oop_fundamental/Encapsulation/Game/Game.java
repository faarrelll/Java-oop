package com.enigma.oop_fundamental.Encapsulation.Game;

import java.util.Scanner;

public class Game {
    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nama Player: ");
        String name = scanner.nextLine();
        Player player = new Player(name);
        Computer computer = new Computer();

        while (true){
            System.out.print("Masukan tebakan angka 1-10: ");
            int guess= scanner.nextInt();
            if (guess == computer.getSecretNumber()){
                System.out.println("Selamat "+player.getName()+" jawaban kamu benar!");
                break;
            } else if(guess > computer.getSecretNumber()){
                System.out.println("Jawabanmu terlalu besar");
            } else {
                System.out.println("Jawabanmu terlalu kecil");
            }
        }

    }
}
