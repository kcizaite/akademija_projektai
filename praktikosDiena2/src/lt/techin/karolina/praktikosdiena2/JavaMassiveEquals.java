package lt.techin.karolina.praktikosdiena2;

import java.util.Scanner;

public class JavaMassiveEquals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first string: ");
        String inputSringOne = input.nextLine();
        System.out.println("Enter your first string: ");
        String inputSringTwo = input.nextLine();
        checkStringsEquality(inputSringOne, inputSringTwo);
    }

    private static void checkStringsEquality(String inputSringOne, String inputSringTwo) {
        boolean equal = inputSringOne.equals(inputSringTwo);
        System.out.println("String " + inputSringOne + " and String " + inputSringTwo + ": " + equal);
    }
}
