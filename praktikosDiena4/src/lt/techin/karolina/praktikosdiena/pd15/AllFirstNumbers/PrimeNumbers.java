package lt.techin.karolina.praktikosdiena.pd15.AllFirstNumbers;

public class PrimeNumbers {

    public static int[] countPrimeNumbers(int start, int end) {
        if (start < 0 || end < 0 || end < start) {
            throw new IllegalArgumentException();
        } else {
            int[] primeNumbers = new int[end - start];
            int counter = 0;
            boolean isPrime = true;
            for (int i = start; i <= end; i++) {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNumbers[counter] = i;
                    counter++;
                }
                isPrime = true;
            }
//                Nukerpame nuliukus
            int[] prime = new int[counter];
            for (int i = 0; i < prime.length; i++) {
                if (primeNumbers[i] != 0) {
                    prime[i] = primeNumbers[i];
                }
            }
            return prime;
        }
    }
}

