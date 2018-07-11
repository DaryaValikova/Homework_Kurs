package com.company.Homework_3.LinkedList;

import java.util.*;

public class DogsLinkedList {
    public static void main(String[] args) {
        List<String> bigDogs = new LinkedList<>();

        bigDogs.add("Овчарка");
        bigDogs.add("Амстафф");
        bigDogs.add("Питбуль");
        bigDogs.add("Лабрадор");
        bigDogs.add("Кане-корсо");
        bigDogs.add("Ротвейлер");
        bigDogs.add("Сенбернар");
        bigDogs.add("Ньюфаундленд");

        System.out.println(bigDogs);
        System.out.println("размер " + bigDogs.size());
        if (bigDogs.isEmpty()) {
            System.out.println("LinkedList is empty!");
        } else System.out.println("LinkedList not empty");

        bigDogs.add("Чихуа-хуа");
        if (bigDogs.contains("Чихуа-хуа")) {
            System.out.println("Чихуа-хуа найден в списке. пожалуйста, удалите это из списка собак. спасибо");
            bigDogs.remove("Чихуа-хуа");
        }

        List<String> otherBigDogs = new LinkedList<>();
        otherBigDogs.add("Доберман");
        otherBigDogs.add("Алабай");


        if (bigDogs.containsAll(otherBigDogs)) {
            System.out.println("другие собаки уже добавлены");
        } else System.out.println("добавьте других собак");

        bigDogs.addAll(otherBigDogs);
        System.out.println(bigDogs);

        if (bigDogs.containsAll(otherBigDogs)) {
            System.out.println("удалите других собак из списка и покажите");
            bigDogs.removeAll(otherBigDogs);
            System.out.println(bigDogs);
        }

        System.out.println("теперь добавьте собак к другим собакам и покажите");
        otherBigDogs.addAll(bigDogs);
        System.out.println(otherBigDogs);

        System.out.println("а теперь удалите из других собак все кроме собак");
        otherBigDogs.retainAll(bigDogs);
        System.out.println(otherBigDogs);

        System.out.println("подчистите других собак и покажите что осталось");
        otherBigDogs.clear();
        System.out.println("в других собаках осталось " + otherBigDogs.size() + " собак");

        if (otherBigDogs.equals(bigDogs)) {
            System.out.println("bigDogs эквивалентны otherBigDogs");
        } else otherBigDogs.addAll(bigDogs);
        System.out.println("теперь состав дургих больших собак такой: " + otherBigDogs);


        System.out.println(bigDogs.hashCode());
        System.out.println(otherBigDogs.hashCode());
        System.out.println(bigDogs.get(3).hashCode());
        System.out.println(bigDogs.get(1).hashCode());


        System.out.println(" значение элемента с индексом 5: " + bigDogs.get(5));
        bigDogs.set(5, "Амстафф");
        Scanner scanner = new Scanner(System.in);

        System.out.println("заменим этот элемент значением");
        String newDog = scanner.next();
        bigDogs.set(5,newDog);
        System.out.println(bigDogs);

        System.out.println("какую собаку добавить? ");
        String newDod2 = scanner.next();
        System.out.println("на какую позицию?");
        int n = scanner.nextInt();
        if (n>bigDogs.size()){
            System.out.println("у нас нет столько песиков(( ");
        }  else bigDogs.add(n,newDod2);
        System.out.println(bigDogs);

        System.out.println("позиция вашей новой собаки "+ bigDogs.indexOf(newDod2));

        bigDogs.add(7,"Питбуль");
        System.out.println("Где последний питбуль? - на позиции "+bigDogs.lastIndexOf("Питбуль"));




        //        bigDogs.removeIf(bigDogs.contains("o")); ????
//       String[] bestGroupsArray = (String[]) bigDogs.toArray();
//        System.out.println(bestGroupsArray);


    }
}
