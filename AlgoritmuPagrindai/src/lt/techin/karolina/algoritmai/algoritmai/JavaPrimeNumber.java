package lt.techin.karolina.algoritmai.algoritmai;

import java.util.Scanner;

public class JavaPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = input.nextInt();
        boolean flag = true;
        int i = 2;
        while (i <= number / 2) {
            if (number % i == 0){
                flag = true;
                break;
            }
            i++;
        }
        if (!flag){
            System.out.println(number + " prime");
        } else {
            System.out.println(number + " not prime");
        }
    }
}

