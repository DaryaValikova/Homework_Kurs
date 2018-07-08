package com.company.Homework_2;

import com.company.Homework_2.accounts.Account;
import com.company.Homework_2.accounts.CreditAccount;
import com.company.Homework_2.accounts.CurrentAccount;
import com.company.Homework_2.accounts.DebtAccount;

import java.util.Scanner;

public class ATM {

    Scanner scanner = new Scanner(System.in);

    public String doIt() { //уточняем, неободимо ли продолжить работать с банкоматом (да/нет)
        System.out.println("продолжить?");  //если да, выполняются следующие операции
        String doIt = scanner.next();
        return doIt;
    }

    public int selectAccountAndWork() { //в зависимости от выбранного счета инициализируем соответствующий объект и основные операции
        System.out.println("выберите счет");
        String accountType = scanner.next();
        if (accountType.contains("деб")) {
            Account account = new DebtAccount(50000);
            mainOperations(account);
        }
        if (accountType.contains("тек")) {
            Account account = new CurrentAccount(200);
            mainOperations(account);
        }

        if (accountType.contains("кред")) {
            Account account = new CreditAccount(-800);
            mainOperations(account);
        }
        return 0;
    }

    private void mainOperations(Account account) { //основные операции
        System.out.println("выберите операцию");
        String operation = scanner.next();

        if (operation.contains("баланс")) {
            System.out.println("текущий остаток " + account.getBalance());
        }
        if (operation.contains("-")) {
            System.out.println("введите сумму");
            System.out.println("текущий остаток " + account.takeMoney());
        }
        if (operation.contains("+")) {
            System.out.println("введите сумму");
            System.out.println("текущий остаток " + account.addMoney());
        }
    }
}

