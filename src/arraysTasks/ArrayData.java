package arraysTasks;

import java.util.Scanner;

public class ArrayData {

    static int[] readArrayFromInput() {                                   //gotowa metoda, żeby nie powtarzać kodu zastosowana od Zad9
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość elementów tablicy");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Podaj wartości kolejnych elementów tablicy");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
