package com.company.Homework_2.accounts;

import java.util.Scanner;

public class DebtAccount extends Account { //дебетовый счет, недопустим отицательный остаток

    public DebtAccount(int balance) {
        super(balance);
    }

    @Override
    public int takeMoney() {
        Scanner scanner = new Scanner(System.in);
        int summOfOperation = scanner.nextInt(); //сумма снятия
            if (this.balance >= summOfOperation) { // условие проверки остатка после снятия. если меньше 0, операция отклоняется
                this.balance = balance - summOfOperation;
                return balance;
            } else System.out.println("превышен остаток. операция отклонена");
        return balance;
    }

        @Override
        public int addMoney () { //внесение средств. ограничений нет
            Scanner scanner = new Scanner(System.in);
            int summOfOperation = scanner.nextInt(); //сумма пополнения
            this.balance = balance + summOfOperation;
            return balance;
        }
    }
