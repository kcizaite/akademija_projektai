package lt.techin.karolina.algoritmai.algoritmai;

// Print with for / while
//   1 2 3 4 5
//1  * * * * *
//2  * * * * *
//3  * * * * *
//4  * * * * *
//5  * * * * *

public class JavaDrawRectangle {
    public static void main(String[] args) {
//        Pirmiausia reikia stulpeliu/eiluciu kieki nusibrezt
        for (int i = 1; i <= 5; i++) { // eilute
            for (int j = 1; j <= 5; j++) { // stulpeliai
                System.out.print("*\t"); // PRINT, ne PRINTLN
            }
            System.out.println();
        }
    }
}
