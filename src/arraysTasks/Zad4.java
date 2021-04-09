package arraysTasks;

public class Zad4 {
    static int sumOfFirstAndLast(int array[]) {
        return array[0] + array[array.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(sumOfFirstAndLast(new int[]{6, 0, 6}));

    }
}
