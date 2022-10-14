package lt.techin.karolina.praktikosdiena2;

import java.util.Scanner;

public class JavaMassiveMinMaxAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers: (for example: 1,2,10.. - without SPACES!");
//        Priimsiu kaip string ir per duota dalyka, pvz. ,. issplitinsiu i numberius
        String inputSring = input.nextLine();
//        System.out.println(inputSring);
        String[] numbersSplit = inputSring.split(",");
//        System.out.println(numbersSplit);
        int[] numberList = {};

//        int numbers = int()
        for (int i = 0; i < numbersSplit.length; i++) {
            String numbersX = numbersSplit[i];
            System.out.println(numbersX);
            char[] numbers = numbersX.toCharArray();
            System.out.println(numbers);

        }

    }
}
