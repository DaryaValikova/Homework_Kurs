package com.company.Homework_2.accounts;

import java.util.Scanner;

public class CurrentAccount extends Account { //текущий счет, ограничений по снятию и внесению нет

    public CurrentAccount(int balance) {
        super(balance);
    }

    @Override
    public int addMoney() {
        Scanner scanner = new Scanner(System.in);
        int summOfOperation = scanner.nextInt();
            this.balance = balance + summOfOperation;
        return balance;
    }

    @Override
    public int takeMoney() {
        Scanner scanner = new Scanner(System.in);
        int summOfOperation = scanner.nextInt();
        this.balance = balance - summOfOperation;
        return balance;
    }
}
