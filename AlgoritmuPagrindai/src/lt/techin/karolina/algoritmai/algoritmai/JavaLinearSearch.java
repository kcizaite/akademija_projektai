package lt.techin.karolina.algoritmai.algoritmai;

import java.util.Arrays;
import java.util.Random;

public class JavaLinearSearch {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
//        TO DO 1. randa skaiciu, grazina indexa to skaiciaus, kitu atveju nieko
//        TO DO 2. istrinti si elementa pagal surasta indexa
//        TO DO 3. istrinti is viso elementa ir sumazinti masyva
        int searchNumber = 5;
        for (int i = 0; i < numbers.length; i++) {
            if (searchNumber == numbers[i]){
                System.out.print(i + " ");
                numbers[i] = 0; // 2 dalis
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));
    }
}
