package lt.techin.karolina.praktikosdiena.pd15.randomNumbers;

import java.util.Random;

public class Generator {
    private static final Random rnd = new Random();

    public static int[] generateNumbers(int arrayLength) {
        int[] rndNumbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; ++i) {
            rndNumbers[i] = rnd.nextInt(300) - 150;
        }
        return rndNumbers;
    }
}
