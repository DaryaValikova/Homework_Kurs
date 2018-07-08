package com.company.Homework_2;

import com.company.Homework_2.ATM;

public class Main_Homework_2 {
    public static void main(String[] args) {
        ATM ATM = new ATM();

        while (ATM.doIt().contains("да")){
            ATM.selectAccountAndWork();
        }
    }
}
