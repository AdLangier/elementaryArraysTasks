package arraysTasks;

import java.util.Scanner;

public class Zad5 {

    static int middleElement(int[] array) {
        return array[(array.length - 1) / 2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość i elementy tablicy");
        int n = scanner.nextInt();
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            tablica[i] = scanner.nextInt();
        }
        System.out.println("środkowy element tablicy to "
                + middleElement(tablica));
    }
}
