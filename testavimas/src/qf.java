import java.util.HashSet;
import java.util.Set;

public class qf {
    public static void main(String[] args) {
//        String number = "K1V1S0";
//        int numberPrice = 0;

//        String numberLetters = number.substring(0, (number.length()/2));
//        String numberNumbers = number.substring(number.length()/2);
//
//        Set<Character> setLetters = new HashSet<Character>();
//        Set<Character> setNumbers = new HashSet<Character>();
//
//        for(int i = 0; i < numberLetters.length(); i++)
//            setLetters.add(numberLetters.charAt(i));
//
//        for (Character letter: setLetters) {
//            if (Character.isLetter(letter));
//            System.out.println("Letter" + letter);
//        }
//
//        if (setLetters.size() == 1){
//            numberPrice += 1000;
//        }
//
//        for(int i = 0; i < numberNumbers.length(); i++)
//            setNumbers.add(numberNumbers.charAt(i));
//        if (setNumbers.size() == 1){
//            numberPrice += 1000;
//        }
//        System.out.println(setLetters);
//
//    }
        String number = "K1V1S0";
        int numberPrice = 0;

        if (number.length() <= 6) {
            if (! Character.isLetter(number.charAt(0)) &&
                    Character.isLetter(number.charAt(1)) &&
                    Character.isLetter(number.charAt(2)) &&
                    Character.isDigit(number.charAt(3)) &&
                    Character.isDigit(number.charAt(4)) &&
                    Character.isDigit(number.charAt(5))) {
            } numberPrice += 10000;

        }
        System.out.println(numberPrice);
    }
}


//if (numeris.length() == 6) {
//
//        if (Character.isLetter(numeris.charAt(0)) &&
//        Character.isLetter(numeris.charAt(1)) &&
//        Character.isLetter(numeris.charAt(2)) &&
//        Character.isDigit(numeris.charAt(3)) &&
//        Character.isDigit(numeris.charAt(4)) &&
//        Character.isDigit(numeris.charAt(5))) {
//        log.debug("OK");
//        } else {
//        log.debug("NOK");
//        }
