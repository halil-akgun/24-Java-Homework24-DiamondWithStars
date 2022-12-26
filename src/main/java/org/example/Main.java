package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
        Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: 2x");
        int a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a; i >= 1; i--) {
            for (int j = i; j < a; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}