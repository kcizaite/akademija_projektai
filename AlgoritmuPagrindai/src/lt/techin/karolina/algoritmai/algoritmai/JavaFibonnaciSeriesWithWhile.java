package lt.techin.karolina.algoritmai.algoritmai;

import java.util.Arrays;

// Cia mokytojo pvz. be input del greicio
public class JavaFibonnaciSeriesWithWhile {
    public static void main(String[] args) {
        int fibNumber = 20;
        int count = 1;
        int firstFibNumber = 0;
        int secondFibNumber = 1;
        int[] fibNumbers = new int[fibNumber + 1]; // saugosim cia

        while(count < fibNumber){
            fibNumbers[count] = firstFibNumber;
            int nextFibNumber = firstFibNumber + secondFibNumber;
            firstFibNumber = secondFibNumber;
            secondFibNumber = nextFibNumber;
            count++;
        }
        System.out.println(Arrays.toString(fibNumbers));
    }
}
