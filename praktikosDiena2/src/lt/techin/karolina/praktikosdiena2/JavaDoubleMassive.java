package lt.techin.karolina.praktikosdiena2;

import java.util.Arrays;
import java.util.Scanner;

public class JavaDoubleMassive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers: (for example: 1.5,2.9,-10.3.. - without SPACES!");
//        double[] numbers = {2.5, 6.9, 1.1, -9.0, 6.8, 9.999};
        String inputSring = input.nextLine();
        String[] numbersSplit = inputSring.split(",");
        System.out.println("Enter your index: ");
        int inputIndex = input.nextInt();
        System.out.println("Enter your new number: ");
        double inputNewNumber = input.nextDouble();

        addNewNumberByIndex(numbersSplit, inputIndex, inputNewNumber);
//        System.out.println(Arrays.toString(numbers));
    }

    private static void addNewNumberByIndex(String[] numbersSplit, int inputIndex, double inputNewNumber) {
        double[] numberList = new double[numbersSplit.length]; // masyvo dydis, maisiukas
        int counter = 0;
        for (String number : numbersSplit) {
            numberList[counter++] = Double.parseDouble(number);
        }

        numberList[inputIndex] = inputNewNumber;
        System.out.println(Arrays.toString(numberList));

//        numbers[0] = 5.3;

    }
}
