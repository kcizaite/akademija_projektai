package lt.techin.karolina.tesinys;
//
import java.util.Arrays;
import java.util.Random;

public class JavaInsertionSort {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        int[] data = new int[100];
        fillData(data);
        System.out.println("Data " + Arrays.toString(data));
        sortingDataWithInsertion(data);
        System.out.println("Sorted data " + Arrays.toString(data));
    }

    private static void sortingDataWithInsertion(int[] data) {
        long start = System.currentTimeMillis();
        int size = data.length;
        for (int step = 1; step < size; step++) { // nuo 1, nes metodas nuo 2 skaiciaus skaiciuoja (simulaicijos info)
            int key = data[step];
            int j = step - 1; //  elementas, kuri paimame ir rusiuojame
            while (j >= 0 && key < data[j]) {
                data[j + 1] = data[j];
                --j;
            }
            data[j + 1] = key;
        }

        long end = System.currentTimeMillis();
        System.out.println("Sorting time: " + (end - start) + " mS");
    }

    private static void fillData(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = rnd.nextInt(1000);
        }
    }
}
