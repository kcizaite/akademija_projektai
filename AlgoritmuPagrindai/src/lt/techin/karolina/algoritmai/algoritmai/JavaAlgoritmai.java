package lt.techin.karolina.algoritmai.algoritmai;

public class JavaAlgoritmai {
//    Algoritmai tai receptai, kaip ir kada daryti
//    Dinaminis dalykas
//    Viename zingsnyje nebus keliu veiksmu

    //    JavaGCD == Didžiausias bendrasis daliklis -> wiki :)
    public static void main(String[] args) {
        int num1 = 81;
        int num2 = -153;

        getGCDWithFor(num1, num2);
        getGCDWithWhile(num1, num2);
        GetGCDWithWhileForPositiveOrNegativeNumbers(num1, num2);
    }

//    Jeigu turime neigiamas ir teigiamas reiksmes
    private static void GetGCDWithWhileForPositiveOrNegativeNumbers(int num1, int num2) {
        num1 = (num1 > 0)?num1 : -num1;
        num2 = (num2 > 0)?num2 : -num2;
        while (num1 != num2){
            if (num1 > num2){
                num1 -= num2;
            } else {
                num2-=num1;
            }
        }
        System.out.println("GCD: " + num1);
    }

//    While methodas
    public static void getGCDWithWhile(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        System.out.println("GCD: " + num1);
    }

//    For methodas
    private static void getGCDWithFor(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD: " + gcd);
    }

}
