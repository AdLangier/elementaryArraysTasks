package arraysTasks;

public class Zad6 {
    static int[] arrayAddition(int[] a1, int[] a2) {
        int[] newArray = new int[a1.length + a2.length];

        int j = 0;
        for (int i = 0; i < a1.length; i++) {
            newArray[i] = a1[i];
        }
        for (int i = a1.length; i < a1.length + a2.length; i++) {
            newArray[i] = a2[j++];
        }
        return newArray;
    }

    public static void main(String[] args) {

    }
}
