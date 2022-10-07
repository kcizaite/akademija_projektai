// SORT, COPY, MAX/MIN, RANDOM
package lt.techin.praktika1;

import java.util.Arrays;
import java.util.Random;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int [] numbers = new int [10]; // bus 10 skaiciu
        System.out.println(Arrays.toString(fillNumberArray(numbers)));
//        kai nieko neidedam i numbers[i] = rnd.nextInt();
//        print [1646087494, -656824733, -779526505, -640707846, 494293594.......
//        kai idejus numbers[i] = rnd.nextInt(1000);
//        print [433, 467, 626, 968, 560, 449, 551, 151, 901, 567]
        printArray(numbers);
//        masyvu rusiavimas SORT
        sortArray(numbers);
//        maximali reiksme
        findMaxElementInArray(numbers);
//        jeigu norime sujungti du masyvus -> COPY
        copyArray(numbers);
    }

    private static void copyArray(int[] numbers) {
        int[] destinationArray = new int[numbers.length + 10]; // turi buti tokio pat ilgio + 10
        for (int i = 0; i < numbers.length; i++) {
            destinationArray[i] = numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(destinationArray));
        int[] copyArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(copyArray));

    }

    private static void findMaxElementInArray(int[] numbers) {
//        reikia suzinoti savo ilgi (range)
        int intMaxValue = Integer.MIN_VALUE; // kazkodel imama priesingybe, searching from index 0
        for (int number:numbers) {
            if (number > intMaxValue) {
                intMaxValue = number;
            }
        }
        System.out.println(intMaxValue);
        // print 973
    }

    private static void sortArray(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
//        print [202, 446, 570, 573, 600, 602, 664, 820, 952, 960] DIDEJIMO TVARKA
    }

    private static void printArray(int[] numbers) {
//        for
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
//            print
//            16
//            169 ...

        }
//        foreach
        for (int element : numbers) {
            System.out.println(element);
//            print vel toki pat sarasa
        }
    }

    private static int[] fillNumberArray(int[] numbers) {
        Math.random();
        Random rnd = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(1000);
        }
        return numbers;

    }
}
