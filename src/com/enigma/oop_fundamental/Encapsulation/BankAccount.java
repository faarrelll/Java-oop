package com.enigma.oop_fundamental.Encapsulation;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount) {
        if(amount < 50000){
            System.out.println("Minimum deposit is 50000");
        } else{
            balance += amount;
            System.out.println("Deposit Succes");
            System.out.println("Total Balance is "+balance);
        }
    }
    public void witdraw(int amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        } else if(amount < 50000){
            System.out.println("Minimum WD is 50000");
        } else {
            balance -= amount;
            System.out.println("WD Succes!");
            System.out.println("Your Balance is "+balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}
