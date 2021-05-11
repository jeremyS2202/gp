package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number; //921309
        System.out.print("input number: ");
        number = input.nextInt();

        int digit1 = number / 100000;
        int digit2 = (number / 10000) % 10;
        int digit3 = (number % 10000) / 1000;
        int digit4 = (number % 1000) / 100;
        int digit5 = (number % 100) / 10;
        int digit6 = (number % 100) % 10;

        int summ1 = digit1 + digit2 + digit3;
        System.out.println("summ1" + summ1);

        int summ2 = digit4 + digit5 + digit6;

        System.out.println("summ2" + summ2);

        if (summ1 == summ2) {
            System.out.println("happy ticket");
        } else {
            System.out.println("unlucky ticket");
        }


    }
}
