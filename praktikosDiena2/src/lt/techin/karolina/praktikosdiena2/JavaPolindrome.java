package lt.techin.karolina.praktikosdiena2;

import java.util.Scanner;

public class JavaPolindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reverseText = "";
        System.out.println("Enter your word");
        String inputWord = input.nextLine();

        int inputWordLength = inputWord.length();

        for (int i = (inputWordLength - 1); i >= 0; --i) {
            reverseText = reverseText + inputWord.charAt(i);
        }
        if (inputWord.toLowerCase().equals(reverseText.toLowerCase())) {
            System.out.println(inputWord + " is a Polindrome word");
        } else {
            System.out.println(inputWord + " is not a Polindrome word");
        }
    }
}
