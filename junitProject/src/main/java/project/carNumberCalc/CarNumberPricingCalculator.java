package project.carNumberCalc;

import java.util.HashSet;
import java.util.Set;

class CarNumberPricingCalculator {
    int numberPrice = 0;

    // ____________________________________________________________________________________________________
    // Jeigu visos trys raidės yra vienodos arba jeigu visi trys skaičiai vienodi - numerio kaina 1000 eur.
    public double calculateaAllNumbersOrAllLettersAreTheSameCost1000(String number) {
        String numberLetters = number.substring(0, (number.length() / 2));
        String numberNumbers = number.substring(number.length() / 2);

        Set<Character> setLetters = new HashSet<Character>();
        Set<Character> setNumbers = new HashSet<Character>();

        for (int i = 0; i < numberLetters.length(); i++)
            setLetters.add(numberLetters.charAt(i));
        if (setLetters.size() == 1) {
            numberPrice += 1000;
        }

        for (int i = 0; i < numberNumbers.length(); i++)
            setNumbers.add(numberNumbers.charAt(i));
        if (setNumbers.size() == 1) {
            numberPrice += 1000;
        }
        return numberPrice;
    }

    // __________________________________________________________
    // Jeigu skaiciai lygus "001","666" - numerio kaina 1000 eur.
    public double calculateNumbers001Or666Cost1000(String number) {
        String numberNumbers = number.substring(number.length() / 2);
        if (numberNumbers.equals("001") || numberNumbers.equals("666")) {
            numberPrice += 1000;
        }
        return numberPrice;
    }

    // _____________________________________________________________________________
    // Jeigu trys raidės vienodos IR trys skaičiai vienodi - numerio kaina 5000 EUR.
    public double calculateAllNumbersAndAllLettersAreTheSameCost5000(String number) {
        String numberLetters = number.substring(0, (number.length() / 2));
        String numberNumbers = number.substring(number.length() / 2);

        Set<Character> setLetters = new HashSet<Character>();
        Set<Character> setNumbers = new HashSet<Character>();

        for (int i = 0; i < numberLetters.length(); i++)
            setLetters.add(numberLetters.charAt(i));
        for (int i = 0; i < numberNumbers.length(); i++)
            setNumbers.add(numberNumbers.charAt(i));
        if ((setLetters.size() == 1) && (setNumbers.size() == 1)) {
            numberPrice += 5000;
        }
        return numberPrice;
    }

    // _______________________________________________________________________________
    // Jeigu raidžių rinkinys yra vienas iš "GOD", "KLR", "BOS" numerio kaina 2000 EUR.
    public double calculateLettersGODOrKLROrBOSCost2000(String number) {
        String numberLetters = number.substring(0, (number.length() / 2));
        if (numberLetters.equals("GOD") || numberLetters.equals("KLR") || numberLetters.equals("BOS")) {
            numberPrice += 2000;
        }
        return numberPrice;
    }

    // ________________________________________________________________________________________
    // Jeigu prie aukščiau minėto raidžių rinkinio pridėsime tris vienodus skaičius - 7000 EUR.
    public double calculateLettersGODOrKLROrBOSAndAllNumbersAreTheSameCost7000(String number) {
        String numberLetters = number.substring(0, (number.length() / 2));
        String numberNumbers = number.substring(number.length() / 2);
        Set<Character> setNumbers = new HashSet<Character>();
        for (int i = 0; i < numberNumbers.length(); i++)
            setNumbers.add(numberNumbers.charAt(i));
        if ((numberLetters.equals("GOD") || numberLetters.equals("KLR") || numberLetters.equals("BOS"))
                && (setNumbers.size() == 1)) {
            numberPrice += 7000;
        }
        return numberPrice;
    }

    // ____________________________________________________________________________________________________________
    // Jeigu numeris yra ne iš trijų simbolių ir trijų skaičių (1-6 simboliai) jis yra vardinis - kaina 10 000 EUR.
    public double calculateCustomNumberCost10000(String number) {
        if (number.length() <= 6) {
            if (Character.isLetter(number.charAt(0)) &&
                    Character.isLetter(number.charAt(1)) &&
                    Character.isLetter(number.charAt(2)) &&
                    Character.isDigit(number.charAt(3)) &&
                    Character.isDigit(number.charAt(4)) &&
                    Character.isDigit(number.charAt(5))) {
            } else {
                numberPrice += 10000;
            }
        }
        return numberPrice;
    }

    // ___________________________________________________________________________________________
    // Jei skaičiuoklei paduodamas blogo formato numeris - turi mesti:
    // IllegalArgumentException su pranešimu - "Incorrect plate number format. Must be 1-6 symbols
    // latin letters and number combination"
    public double calculatePriceException(String number) throws IllegalArgumentException {
        if ((number.length() > 6) || (number.isEmpty()) || (!number.matches("^[A-Z0-9.]+$"))) {
            throw new IllegalArgumentException(
                    "Incorrect plate number format. Must be 1-6 symbols, latin letters and number combination");
        }
        return numberPrice;
    }
}