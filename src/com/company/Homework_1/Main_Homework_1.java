package com.company.Homework_1;

import java.util.Scanner;

public class Main_Homework_1 {

    public static void main(String[] args) {

//        ввод текста по которому будет производиться фильтрация
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение, по которому необходимо отфильтровать текст");
        String filterText = scanner.nextLine();

//        разделяем введенный текст по пробелам
        String[] wordOfFilterText;
        wordOfFilterText = filterText.split(" ");

//        фильтруем и выводим без учета регистра
        for (int k = 0; k < wordOfFilterText.length; k++) {
            String nonRegisterWord = wordOfFilterText[k].toLowerCase();
            for (int i = 0; i < args.length; i++) {
                if (args[i].toLowerCase().contains(nonRegisterWord)) {
                    System.out.println(args[i]);
                }
            }
        }
    }
}
