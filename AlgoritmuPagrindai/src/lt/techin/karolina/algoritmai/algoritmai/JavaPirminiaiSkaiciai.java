package lt.techin.karolina.algoritmai.algoritmai;

import java.util.Scanner;

public class JavaPirminiaiSkaiciai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean primary = true;

        if (number % 1 == number && number % number == 1) {
            primary = true;
        } else {
            primary = false;
        }
        if (!primary) {
            System.out.println(number + " primary");
        } else {
            System.out.println(number + "  not primary");
        }

    }
}
