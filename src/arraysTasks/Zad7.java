package arraysTasks;

import java.util.Scanner;

public class Zad7 {
    static int valSum(int[] array) {                        // 1 sposób z użyciem pętli for
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int valSum2(int[] array) {                       // 2 sposób z użyciem pętli foreach
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość elementów tablicy");
        int aQuantity = scanner.nextInt();
        System.out.println("Podaj wartości kolejnych elementów tablicy");
        int[] array = new int[aQuantity];
        for (int i = 0; i < aQuantity; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Suma wartości elementów to: " + valSum(array));
        System.out.println("Suma wartości elementów to: " + valSum2(array));
    }
}
