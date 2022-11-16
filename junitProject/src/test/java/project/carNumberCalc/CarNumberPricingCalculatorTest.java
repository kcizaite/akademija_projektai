package project.carNumberCalc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarNumberPricingCalculatorTest {
    CarNumberPricingCalculator cnpc;

    @BeforeEach
    void setup() {
        cnpc = new CarNumberPricingCalculator();
    }

    // ____________________________________________________________________________________________________
    // Jeigu visos trys raidės yra vienodos arba jeigu visi trys skaičiai vienodi - numerio kaina 1000 eur.
    @Test
    void testCalculateAllNumbersOrAllLettersAreTheSameCost1000AllLetters() {
        assertEquals(1000, cnpc.calculateaAllNumbersOrAllLettersAreTheSameCost1000("AAA001"));
    }

    @Test
    void testCalculateAllNumbersOrAllLettersAreTheSameCost1000AllNumbers() {
        assertEquals(1000, cnpc.calculateaAllNumbersOrAllLettersAreTheSameCost1000("AAB000"));
    }

    @Test
    void testCalculateAllNumbersOrAllLettersAreTheSameCost1000AllDiff() {
        assertEquals(0, cnpc.calculateaAllNumbersOrAllLettersAreTheSameCost1000("AAB001"));
    }

    // __________________________________________________________
    // Jeigu skaiciai lygus "001","666" - numerio kaina 1000 eur.
    @Test
    void testCalculateNumbers001Cost1000() {
        assertEquals(1000, cnpc.calculateNumbers001Or666Cost1000("AAA001"));
    }

    @Test
    void testCalculateNumbers666Cost1000() {
        assertEquals(1000, cnpc.calculateNumbers001Or666Cost1000("AAA666"));
    }

    @Test
    void testCalculateNumbers001Or666Cost1000WithWrongNumbers() {
        assertEquals(0, cnpc.calculateNumbers001Or666Cost1000("AAA002"));
    }

    // _____________________________________________________________________________
    // Jeigu trys raidės vienodos IR trys skaičiai vienodi - numerio kaina 5000 EUR.
    @Test
    void testCalculateaAllNumbersOAndAllLettersAreTheSameCost5000() {
        assertEquals(5000, cnpc.calculateAllNumbersAndAllLettersAreTheSameCost5000("AAA000"));
    }

    void testCalculateaAllNumbersOAndAllLettersAreTheSameCost5000AllDiff() {
        assertEquals(0, cnpc.calculateAllNumbersAndAllLettersAreTheSameCost5000("AAB001"));
    }

    // _______________________________________________________________________________
    // Jeigu raidžių rinkinys yra vienas iš "GOD", "KLR", "BOS" numerio kaina 2000 EUR.
    @Test
    void testCalculateLettersGODCost2000() {
        assertEquals(2000, cnpc.calculateLettersGODOrKLROrBOSCost2000("GOD000"));
    }

    @Test
    void testCalculateLettersKLRCost2000() {
        assertEquals(2000, cnpc.calculateLettersGODOrKLROrBOSCost2000("KLR000"));
    }

    @Test
    void testCalculateLettersBOSCost2000() {
        assertEquals(2000, cnpc.calculateLettersGODOrKLROrBOSCost2000("BOS000"));
    }

    @Test
    void testCalculateLettersGODOrKLROrBOSCost2000WithWrongLetters() {
        assertEquals(0, cnpc.calculateLettersGODOrKLROrBOSCost2000("GUY000"));
    }

    // ________________________________________________________________________________________
    // Jeigu prie aukščiau minėto raidžių rinkinio pridėsime tris vienodus skaičius - 7000 EUR.
    @Test
    void testCalculateLettersGODAndAllNumbersAreTheSameCost700() {
        assertEquals(7000, cnpc.calculateLettersGODOrKLROrBOSAndAllNumbersAreTheSameCost7000("GOD000"));
    }

    @Test
    void testCalculateLettersKLRAndAllNumbersAreTheSameCost700() {
        assertEquals(7000, cnpc.calculateLettersGODOrKLROrBOSAndAllNumbersAreTheSameCost7000("KLR000"));
    }

    @Test
    void testCalculateLettersBOSAndAllNumbersAreTheSameCost700() {
        assertEquals(7000, cnpc.calculateLettersGODOrKLROrBOSAndAllNumbersAreTheSameCost7000("BOS000"));
    }

    @Test
    void testCalculateLettersGODOrKLROrBOSAndAllNumbersAreTheSameCost700WrongLettersType() {
        assertEquals(0, cnpc.calculateLettersGODOrKLROrBOSAndAllNumbersAreTheSameCost7000("GUY000"));
    }

    // ____________________________________________________________________________________________________________
    // Jeigu numeris yra ne iš trijų simbolių ir trijų skaičių (1-6 simboliai) jis yra vardinis - kaina 10 000 EUR.
    @Test
    void estCalculateCustomNumberCost10000Example1() {
        assertEquals(10000, cnpc.calculateCustomNumberCost10000("K1V1S"));
    }

    @Test
    void estCalculateCustomNumberCost10000Example2() {
        assertEquals(10000, cnpc.calculateCustomNumberCost10000("GG1600"));
    }

    @Test
    void estCalculateCustomNumberCost10000Example3() {
        assertEquals(10000, cnpc.calculateCustomNumberCost10000("GREITI"));
    }

    @Test
    void estCalculateCustomNumberCost10000WrongExample() {
        assertEquals(0, cnpc.calculateCustomNumberCost10000("AAA000"));
    }

    // ___________________________________________________________________________________________
    // Jei skaičiuoklei paduodamas blogo formato numeris - turi mesti:
    // IllegalArgumentException su pranešimu - "Incorrect plate number format. Must be 1-6 symbols
    // latin letters and number combination"
    @Test
    void testCalculatePriceException() {
        assertThrows(IllegalArgumentException.class, () -> cnpc.calculatePriceException("AAA00@"));
        assertThrows(IllegalArgumentException.class, () -> cnpc.calculatePriceException("aaa00@"));
        assertThrows(IllegalArgumentException.class, () -> cnpc.calculatePriceException(""));
        assertThrows(IllegalArgumentException.class, () -> cnpc.calculatePriceException("AAA0000"));
    }
}