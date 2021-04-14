package arraysTasks;

public class Zad12 {
    static int[] middleValues(int[] array) {
        int[] newArray;
        if (array.length == 0) {
            newArray = array;
        } else {
            newArray = new int[2];
            newArray[0] = array[array.length / 2 - 1];
            newArray[1] = array[array.length / 2];
        }
        return newArray;
    }
}
