package com.company.Homework_3.Poker;

import java.util.Random;
import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("введите количество игроков");
        int n = scanner.nextInt(); //кол-во игроков
        if (n < 2) {
            System.out.println("слишком мало игроков");
        } else if (n > 10) {
            System.out.println("слишком много игроков");
        } else {
            String[] cardFlash = {"крести", "буби", "черви", "пики"};
            String[] cardRank = {"2 ", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
            String[] pokerCards = new String[52];

//        инициализируем колоду
            for (int i = 0; i < cardFlash.length; i++) {
                for (int j = 0; j < cardRank.length; j++) {
                    int m = i + j * cardFlash.length;
                    pokerCards[m] = cardRank[j] + " " + cardFlash[i];
                }
            }

//        перемешиваем колоду
            for (int k = 0; k < pokerCards.length; k++) {
                int indexRandomCard = random.nextInt(52);
                String randomCard = pokerCards[indexRandomCard]; //Находим рандомную карту
//            меняем местами текущую и рандомную карту
                pokerCards[indexRandomCard] = pokerCards[k];
                pokerCards[k] = randomCard;
            }
//        раздаем колоду на n игроков
            for (int k = 0; k < n * 5; k++) {
                System.out.print(pokerCards[k] + ", ");
                if ((k + 1) % 5 == 0 & k > 3) {
                    System.out.println();
                }

            }
        }
    }
}


