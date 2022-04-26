import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[500000];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }

        sortTimer(array);
//        System.out.println(Arrays.toString(array));
//        QuickSort.quickSort(array);
//        System.out.println("After");
//        System.out.println(Arrays.toString(array));


    }


    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void sortTimer(int[] array) {
        System.out.println("Initial...");
        long time1 = System.currentTimeMillis();

//        BubbleSort.bubbleSort(array);
        QuickSort.quickSort(array);

        System.out.println("Sorted...");
        long time2 = System.currentTimeMillis();
        long ms  = time2 - time1;
        long s = ms / 1000;
        long remainingMs = ms % 1000;
        long min = s / 60;
        long remainingS = s % 60;        ;
        System.out.println("Sorting took " + min + "m " + remainingS + "s " + remainingMs + "ms");
    }


}
