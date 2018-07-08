package com.company.Homework_2.accounts;

import java.util.Scanner;

public class CreditAccount extends Account { //кредитный счет, недопустим положительный остаток

    public CreditAccount(int balance) {
        super(balance);
    }

    @Override
    public int addMoney() {
        Scanner scanner = new Scanner(System.in);
        int summOfOperation = scanner.nextInt(); //сумма внесения
        //        задаем условие проверки остатка после внесения. если больше 0, операция отклоняется
        if ((this.balance + summOfOperation) <= 0) {
            this.balance = balance + summOfOperation;
        } else System.out.println("сумма пополения больше суммы остатка. операция отклонена");
        return balance;
    }


    @Override
    public int takeMoney() {//снятие средств. ограничений нет
        Scanner scanner = new Scanner(System.in);
        int summOfOperation = scanner.nextInt(); //сумма снятия
        this.balance = balance - summOfOperation;
        return balance;
    }
}
