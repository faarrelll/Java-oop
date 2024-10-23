package com.enigma.oop_fundamental.Encapsulation;

public class BankApp {
    public static void main(String[] args) {
        BankAccount farrel = new BankAccount(1000000);
        farrel.deposit(500000);
        farrel.witdraw(700000);
        farrel.witdraw(70000000);


    }
}
