package arraysTasks;

import java.util.Arrays;

public class Zad11 {
    static int[] sortArray(int[]array){
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {                  //korzystamy z gotowej metody sort() - sama metoda w tej klasie,
        int[] array = ArrayData.readArrayFromInput();         //sortArray() jest nie potrzebna - wykonuje tą samą instrukcję
        int[] sortedArray = sortArray(array);                 // całe wywołanie w metodzie main tylko poglądowe

        System.out.println("Posortowana tablica to: ");

        for (int value: sortedArray){
            System.out.print(value+ " ");
        }
    }
}
