package lt.techin.karolina.tesinys;
//        Efectyvesnis uz BubbleSort
import java.util.Arrays;
import java.util.Random;

public class JavaSelectionSort {

    private static Random rnd = new Random();

    public static void main(String[] args) {
        int[] data = new int[100];
        fillData(data);
        System.out.println("Data " + Arrays.toString(data));
        sortingDataWithSelection(data);
        System.out.println("Sorted data " + Arrays.toString(data));
    }

    private static void sortingDataWithSelection(int[] data) {
        long start = System.currentTimeMillis();
        int size = data.length;
        for (int step = 0; step < size; step++) {
            int minIndex = step; // inicilizuojam maziausia verte uzfiksuodami?
            for (int i = step + 1; i < size; i++) { // min search, pradedam nuo sekancios j = step + 1
                if (data[i] < data[minIndex]) {
                    minIndex = i;
                }
            }
            int tmp = data[step];
            data[step] = data[minIndex];
            data[minIndex] = tmp;

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

