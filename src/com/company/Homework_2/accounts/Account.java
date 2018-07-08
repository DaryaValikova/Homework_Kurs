package com.company.Homework_2.accounts;

public abstract class Account {
    public int balance;


    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public abstract int addMoney();


    public abstract int takeMoney();
}

