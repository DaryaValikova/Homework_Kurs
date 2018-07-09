package com.company.Homework_3.Poker;

import java.util.Random;
import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("введите количество игроков");
        int n = scanner.nextInt(); //кол-во игроков
        String[] cardFlash = {"крести", "буби", "черви", "пики"};
        String[] cardRank = {"2 ", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[][] playerCards = new String[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                int randomIndexFlash = random.nextInt(cardFlash.length);
                int randomIndexRank = random.nextInt(cardRank.length);
                playerCards[i][j] = cardRank[randomIndexRank] + " " + cardFlash[randomIndexFlash] + ", ";
                System.out.print(playerCards[i][j]);
            }
            System.out.println();
        }
    }
}
