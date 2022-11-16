package lt.techin.karolina.praktikosdiena2;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class JavaMassiveMinMaxAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers: (for example: 1,2,10.. - without SPACES!");
//        Priimsiu kaip string ir per duota dalyka, pvz. ,. issplitinsiu i numberius
        String inputSring = input.nextLine();
        String[] numbersSplit = inputSring.split(",");

        int[] numberList = new int[numbersSplit.length]; // masyvo dydis, maisiukas
        int counter = 0;
        for (String number : numbersSplit) {
            numberList[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numberList));

        int maxNumber = Arrays.stream(numberList).max().getAsInt();
        int minNumber = Arrays.stream(numberList).min().getAsInt();
        double avgNumber = Arrays.stream(numberList).average().getAsDouble();

        System.out.println("Max value : " + maxNumber);
        System.out.println("Min value : " + minNumber);
        System.out.println("Avg value : " + avgNumber);
    }
}
