package lt.techin.karolina.algoritmai.algoritmai;
// Print triangle with for or while
// *
// * *
// * * *
// * * * *
// * * * * *

public class JavaDrawTriangle {
    public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) { // eilute
                for (int j = 1; j <= i; j++) { // stulpeliai
                    System.out.print("*\t");
                }
                System.out.println();
            }
    }
}

