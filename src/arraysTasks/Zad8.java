package arraysTasks;

import java.util.Scanner;

public class Zad8 {
    static int maxValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int maxValue2(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe elementów tablicy");

        int aQuantity = scanner.nextInt();

        System.out.println("Podaj wartości kolejnych elementów tablicy");

        int[] array = new int[aQuantity];

        int j = 0;                                             // przy nadawaniu wartości za pomocą pętli foreach,
        for (int value : array) {                              // niezbędna jest zmienna pomocnicza, żeby zapobiec nadaniu tej samej wartości wszystkim elementom
            array[j] = scanner.nextInt();
            j++;

        }
        System.out.println("Największa wartość w tablicy to: ");
        System.out.println(maxValue(array));
        System.out.println(maxValue2(array));
    }

}
