package arraysTasks;

public class Zad1 {
    static int getFirst(int[] array) {
        return array[0];
    }

    public static void main(String[] args) {
        System.out.println(getFirst(new int[]{1, 5, 6, 8, 3})); // inicializazja tablicy słowem "new"
    }
}
