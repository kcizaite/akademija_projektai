package lt.techin.karolina.tesinys;
//        JavaBubbleSort - paprasciausias random skaiciu didejimo tvarka sudejimas
import java.util.Arrays;
import java.util.Random;

public class JavaSorting {

    private static Random rnd = new Random();

    public static void main(String[] args) {
        int[] data = new int[100];
        fillData(data);
        System.out.println("Data " + Arrays.toString(data));
        sortingDataWithBubbles(data);
        System.out.println("Sorted data " + Arrays.toString(data));
    }

    private static void sortingDataWithBubbles(int[] data) {
        long start = System.currentTimeMillis();
        int size = data.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) { // sitas for kitoks
                if (data[j] > data[j+1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
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
