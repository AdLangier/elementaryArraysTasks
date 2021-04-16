package arraysTasks;

public class Zad14 {

    static String[] toLowerCases(String[] array) {
        String[] lowerCaseArray = new String[array.length];         // Zgodnie z treścią zadania deklarujemy nową tablicę o długości tablicy z przyjętego argumentu, która będzie naszym wynikiem metody
        for (int i = 0; i < array.length; i++) {                    // dla każdego elementu nowej tablicy "lowerCaseArray" nadajemy wykonując metodę "toLowerCase" wartości zgodne z tablicą "array",
            lowerCaseArray[i] = array[i].toLowerCase();             //     która jest podanym argumentem
        }
        return lowerCaseArray;
    }

    public static void main(String[] args) {

        String[] array = ArrayData.stringArrayInput();              // wykorzystujemy wcześniej utworzoną w klasie ArrayData metodę, która prosi użytkownika o wprowadzenie danych tablicy typu String
        System.out.println("Tablica z małymi literami:");
        for (String value : toLowerCases(array)) {
            System.out.println(" " + value);
        }
    }
}
