package arraysTasks;

public class Zad15 {

    static int maxWordIndex(String[] array){                 // 1 sposób z wykorzystaniem pętli fori, można również za pomocą foreach
        String max = array[0];                               // dwie zmienne pomocnicze
        int indexOfMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max.length()){
                max = array[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    public static void main(String[] args) {
        String[] array = ArrayData.stringArrayInput();

        System.out.println("Indeks najdłuższego wyrazu" +
                " w tablicy to: "+maxWordIndex(array)+" a sam wyraz to: "+array[maxWordIndex(array)]);
    }


}
