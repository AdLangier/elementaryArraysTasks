package arraysTasks;

public class Zad13 {

    //Zadanie stosunkowo proste ale trzeba dobrze zaplanować

    // 1. Tworzymy metodę, która sprawdza czy element tablicy to pięcioliterowe słowo
    //    metoda jest typu boolean i zwraca true lub false argumentem jest typ String

    static boolean isFive(String word) {
        if (word.length() != 5) {                                    // 1.1 pierwszy warunek wyklucza słowa inne niż pięcioliterowe
            return false;                                            //    (dodatkowo jak udostępnić użytkownikowi wybór ilości liter??)
        } else {
            for (int i = 0; i < word.length(); i++) {               // 1.2 drugi warunek sprawdza i wyklucza słowa, w których występują cyfry
                if (!Character.isLetter(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;                                                 // 1.3 Jeśli warunki 1.1 i 1.2 nie spełnią się oznacza to, że mamy słowo pięcioliterowe - "true"
    }

    // 2. Docelowa metoda zwracająca wyrazy pięcioliterowe w tablicy

    static String[] getFiveLetterWords(String[] array) {
        int length = 0;                                              // 2.1 wprowadzamy zmienną pomocniczą "length" - określi nam ile elementów będzie zawierała tablica słów pięcioliterowych
        boolean[] indexes = new boolean[array.length];               // 2.2 deklarujemy tablicę typu boolean, która zwróci "true" lub "false" w zależności od ilości liter w elemenctach tablicy "array"
        for (int i = 0; i < array.length; i++) {                     // 2.3 uzupełniamy tablicę booleanów wartościami "true" lub "false"
            if (array[i] != null) {                     //2.3.1 warunek który wyklucza/pomija puste "słowo" w tablicy array
                if (isFive(array[i])) {                 //2.3.2 jeśli warunek 2.3.1 nie jest spełniony metoda sprawdza
                    indexes[i] = true;                  //      czy wartość elementu wprowadzonej tablicy to pięcioliterowe słowo, jeśli tak dodaje wartość "true" do tablicy boolean(indexes)
                    length++;                           //      jeśli wartość elementu to "true" dodajemy +1 do "length" (ilości elemetów zadeklarowanych na początku metody)
                } else {                                //2.3.3 jeśli warunek 2.3.2 nie jest spełniony, wartością dodaną w "indexes" będzie "false"
                    indexes[i] = false;
                }
            }
        }
        String[] words = new String[length];                         // 2.4 deklarujemy docelową tablicę do wyświetlenia - jej wartościami będą już tylko słowa pięcioliterowe czyli nasz wynik,
                                                                     //     a jej wielkość to wcześniej określona ilość elementów "length"
        int index = 0;                                               // 2.5 deklarujemy zmienną pomocniczą typu int "index", która będzie odpowiadać za indeks elementu tablicy words
        for (int i = 0; i < array.length; i++) {                     // 2.6 dla każdego elementu tablicy wprowadzonej przez użytkownika nadajemy wartość
            if (indexes[i]) {                           // 2.6.1 warunek sprawdza czy wartość jest "true"(czy słowo jest pięcioliterowe)
                words[index++] = array[i];              //       jeśli tak wartość wprowadzona array[i] równa jest kolejnej wartości tablicy zwracanej words[index++]
            }
        }
        return words;                                                // 2.7 OSTATECZNY WYNIK -> jest to tablica typu String[] o nazwie "words"
    }                                                                //     -> zwraca ona tylko wyrazy pięcioliterowe jako swoje wartości


    // 3. Wywołanie - przetestowanie metody z użyciem metody main


    public static void main(String[] args) {
        String[] fiveLetterArray = ArrayData.stringArrayInput();     // 3.1 deklarujemy tablicę z danymi wprowadzonymi przez użytkownika za pomocą wcześniej utworzonej metody
                                                                     //     w klasie ArrayData
        System.out.println("Słowa pięcioliterowe spośród wprowadzonych to: ");

        for (String word : getFiveLetterWords(fiveLetterArray)) {    // 3.2 za pomocą pętli foreach nadajemy wartościom tablicy typ String
            System.out.print(word+" ");                             //     i wyświetlamy/"drukujemy" kolejno wszystkie wartości
        }
    }
}
