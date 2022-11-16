import java.util.HashSet;
import java.util.Set;

public class as {
    public static void main(String[] args) {
        String number = "112";

        int numberPrice = 0;

        String numberLetters = number.substring(0, (number.length() / 2));
        Set<Character> setLetters = new HashSet<Character>();

        for (int i = 0; i < numberLetters.length(); i++)
            setLetters.add(numberLetters.charAt(i));
        if (setLetters.size() == 1) {
            numberPrice += 1000;
            System.out.println(numberLetters + "numberLetters + 1000 ++++");
            } else if (setLetters.size() == 0) {
                numberPrice += 0;
                System.out.println(numberPrice + "numberLetters + 0 + naujas");
            } else {
                numberPrice += 0;
                System.out.println(numberLetters + "numberLetters + 0");
            }
            System.out.println(numberPrice);
        }
//        String numberNumbers = number.substring(number.length() / 2);
//        Set<Character> setNumbers = new HashSet<Character>();

        //        for (int i = 0; i < numberNumbers.length(); i++)
//            setNumbers.add(numberNumbers.charAt(i));
//        if (setNumbers.size() == 1) {
//            numberPrice += 1000;
//            System.out.println(numberPrice + "numberNumbers + 1000");
//        } else if (setNumbers.size() == 0){
//            numberPrice += 0;
//            System.out.println(numberPrice + "numberNumbers + 0 + naujas");
//        } else {
//            numberPrice += 0;
//            System.out.println(numberPrice + "numberNumbers + 0");
    }





