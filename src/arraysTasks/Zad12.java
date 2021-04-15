package arraysTasks;

public class Zad12 {
    static int[] middleValues(int[] array) {
        int[] newArray;
        if (array.length == 0) {                                 //dodatkowy warunek, który obsługuje przypadek, w którym tablica nie ma elementów
            newArray = array;
        } else {
            newArray = new int[2];                               // w przeciwnym wypadku tworzy nową tablicę dwuelementową, której argumenty to kolejno dwa środkowe argumenty
            newArray[0] = array[array.length / 2 - 1];           // wprowadzonej tablicy ( zakładając,że ilość argumentów jest zawsze parzysta)
            newArray[1] = array[array.length / 2];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = ArrayData.readArrayFromInput();

        System.out.println("Dwa środkowe elementy tablicy to: ");
        for (int value : middleValues(array)) {                   // możliwość skrócenia kodu! w pętli foreach odrazu możemy wykorzystać metodę,
            System.out.println(value);                            // która zwraca tablicę, bez konieczności wcześniejszego wykonania metody
        }
    }
}
