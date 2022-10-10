package lt.techin.karolina.algoritmai.algoritmai;
//
import java.util.Scanner;

public class JavaFibonacciSeries {
    public static void main(String[] args) {
//        TO DO Fibonacci numbers from 0 to n (input)
//        With while/for
//         big integer
        Scanner input = new Scanner(System.in);
        System.out.println("Your input: ");
        int number = input.nextInt();
        int fiboNumber = 0;
        for (int i = 0; i < number; i++) {
            fiboNumber += i;

        }
        System.out.println(fiboNumber);
    }
}
