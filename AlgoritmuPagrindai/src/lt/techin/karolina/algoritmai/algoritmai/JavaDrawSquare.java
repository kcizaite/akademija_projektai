package lt.techin.karolina.algoritmai.algoritmai;
// print
//   1 2 3 4 5
// 1 * * * * *
// 2 *       *
// 3 *       *
// 4 *       *
// 5 * * * * *

public class JavaDrawSquare {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // eilute
            for (int j = 1; j <= 5; j++) { // stulpeliai
                if(i == 1 || i == 5) {
                    System.out.print("*\t");
                } else if (j == 1 || j == 5){
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
            }
        }
    }
