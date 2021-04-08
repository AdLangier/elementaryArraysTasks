package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy");
        int n = scanner.nextInt();
        int[] table = new int[n];

        System.out.println("podaj wartości elementów tablicy");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();                 // oprócz liczby elementów, użytkownik wprowadza również konkretnie elementy
            table[i] = value;
        }
        System.out.println(Arrays.toString(table));
        for (int i = n-1; i >=0 ; i--) {                  // wyświetlanie wartości odwrotnie
            System.out.print(table[i]+", ");
        }
    }
}
