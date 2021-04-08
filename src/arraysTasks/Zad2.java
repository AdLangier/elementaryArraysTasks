package arraysTasks;

public class Zad2 {
    static int getLast(int[] array){
        return array[array.length -1];
    }

    public static void main(String[] args) {
        System.out.println(getLast(new int[]{1,3,4,2,6}));   // analogicznie do zad 1
    }
}
