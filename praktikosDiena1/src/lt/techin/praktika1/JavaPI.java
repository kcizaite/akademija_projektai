package lt.techin.praktika1;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaPI {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input number PI accuracy: ");
        int accuracy = userInput.nextInt();

        BigDecimal pi = new BigDecimal(Math.PI);
        double piNumber = Math.PI; // iki 15 skaitemnu tik duos, be BigDecimal
        System.out.format("%." + accuracy + "f%n", piNumber);
//        print 3.14159265358979300000000000000000000000000000000000
        System.out.format("%." + accuracy + "f%n", pi);
//        print 3.14159265358979311599796346854418516159057617187500 (bet cia irgi mazai)

//        "%." = po kablelio nurodom, kad naudosim, % iki tasko info kazkokia jau yra
//        "f%n" = float, %n -> ka paduodam


    }
}
