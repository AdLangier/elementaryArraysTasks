package arraysTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Zad6 {
    static int[] arrayAddition(int[] a1, int[] a2) {
        int[] newArray = new int[a1.length + a2.length];

        int a2value = 0;
        for (int i = 0; i < a1.length; i++) {
            newArray[i] = a1[i];
        }
        for (int i = a1.length; i < a1.length + a2.length; i++) {
            newArray[i] = a2[a2value++];
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                                  //wprowadzanie wartości tablic przez użytkownika
        System.out.println("Podaj ilość elementów pierwszej tablicy");
        int quantityA1 = scanner.nextInt();
        int[] a1 = new int[quantityA1];
        System.out.println("Podaj wartości elementów pierwszej tablicy");
        for (int i = 0; i < quantityA1; i++) {
            a1[i] = scanner.nextInt();
        }
        System.out.println("Podaj ilość elementów drugiej tablicy");
        int quantityA2 = scanner.nextInt();
        int[] a2 = new int[quantityA2];
        System.out.println("Podaj wartości elementów drugiej tablicy");
        for (int i = 0; i < quantityA2; i++) {
            a2[i] = scanner.nextInt();
        }
        int[] arraysSum = arrayAddition(a1, a2);                       // wyświetlanie tylko wartości tablicy, z wykorzystaniem pętli foreach,
        System.out.print("Suma to:");                                  // żeby nadać typ zmiennej wszystkim indeksom tablicy i później to wyświetlić
        for (int value : arraysSum) {
            System.out.print(" " + value);
        }
        System.out.println("\n" + Arrays.toString(arraysSum));         //przy wyświetlaniu tablicy jako String wymagana jest składnia Arrays.toString(tablica);!!!
                                                                       //wykorzystujemy to również przy innych metodach = Arrays.metoda(tablica);

    }
}
