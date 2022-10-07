package lt.techin.praktika1;

public class DifficultRecursio {
    public static void main(String[] args) {
        callDifficultRecursion(10);
    }

    private static void callDifficultRecursion(int number) {
        System.out.println("First difficult recursion section: " + number);
        makeRecursion(number);
        System.out.println("Second difficult recursion section: " + number);
    }

    private static void makeRecursion(int number) {
        number ++;

        System.out.println("First make recursion section: " + number);
        if (number != 0) {
            callDifficultRecursion(number);
        }
        System.out.println("Second make recursion section: " + number);
    }
}

// CIA YRA BLOGA PRAKTIKA, RASO TIE KAS NEMOKA OBJEKTINIO PROGRAMAVIMO
