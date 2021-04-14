package arraysTasks;

public class Zad9 {
    static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] array = ArrayData.readArrayFromInput();             //wywołanie metody z innej klasy poprzedzone nazwą tej klasy
        int[] reversedArray = reverse(array);
        System.out.println("Odwrócona tablica to: ");


        for (int value : reversedArray) {                         //metoda reverse() zwraca tablicę - za pomocą pętli foreach wyświetlamy jej wartości w konsoli
            System.out.print(value + " ");
        }
    }


}
