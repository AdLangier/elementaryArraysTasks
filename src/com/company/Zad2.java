package com.company;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Podaj wartości elementów tablicy");
        for (int i = 0; i < n; i++) {
            int eValue = scanner.nextInt();
            array[i] = eValue;
        }

        int minimum = array[0];                      //zmienna pomocnicza i PĘTLA FOREACH!!!!!!!!!!
        for (int value : array) {
            if (value < minimum) {
                minimum = value;
            }

        }
        System.out.println("najmniejsza wartość w podanej tablicy to: " + minimum);
    }
}
