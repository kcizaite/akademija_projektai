package lt.techin.praktika1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        FAKTORIALU SKAICIAVIMAS n! = n * (n-1) * (n-2) ... (n-n)
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input factorial number: ");
        int number = userInput.nextInt();
//        Galime rasyti su Math, stream, bet reikia suprasti kaip viskas kyla ir is kur :)
//        Recursijos variantas
        System.out.println("getFactorialWithRecursion: " + getFactorialWithRecursion(number));

//        System.out.println("getFactorialWithoutRecursion: " + getFactorialWithoutRecursion);

//        Kaip kviesti be rekursijos
        getFactorialWithoutRecursion(number);


    }

    private static int getFactorialWithoutRecursion(int number) {
        int factorialNumber = 1; // lokalus kintamasis, turim prirasyt
        for (int i = 0; i < number; i++) {
            factorialNumber *= i;
        }
        return factorialNumber;
    }



    private static int getFactorialWithRecursion(int number) {
//        Kadangi 1 ir 0 neturi reiksmes (cia is matematikos, wikipedia)
        if (number <= 2) {
            return number; // Ta ka gauname, ta graziname
        }
//        Visais kitais atvejais
        return number * getFactorialWithRecursion(number - 1);
    }
}

// STELOS KODAS!!!
// SUTVARKYTI PAGAL VIDEO
//long start = System.currentTimeMillis();
//System.out.println("getFactorialWithRecursion " + getFactorialWithRecursion(number));
//long end = System.currentTimeMillis();
//System.out.println(end - start + "ms");

//getFactorialWithBigInteger(number);
//public static BigInteger getFactorialWithBigInteger(int number) {
//BigInteger factorialNumber = BigInteger.ONE;
//for (int i=2; i <= number; i++){
//factorialNumber = factorialNumber.multiply(BigInterger.valueOf(i));
//}
//return factorialNumber;

//}

//sout("" + getFactorialWithBigInteger)