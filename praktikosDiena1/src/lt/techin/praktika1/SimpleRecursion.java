package lt.techin.praktika1;

public class SimpleRecursion {
    public static void main(String[] args) {
//        REKURSIJA -> kai pats save kvieciu daryti darba
        callSimpleRecursion(5); // ALT ENTER -> Metodo pavadinimas, kuris 5 kartus kartojamas

    }

    private static void callSimpleRecursion(int number) {
        number--; // kai gausime skaiciu, ji mazinsime 1
        System.out.println("First method section: " + number);
        if (number != 0) { // jei taps 0, nebekviesime
            callSimpleRecursion(number);
        }
        System.out.println("Second method section: " + number);
// print
//First method section: 4 // Kiekvienos rekursijos metu kuriame objektai, nes ant to pacio neveikia
//First method section: 3
//First method section: 2
//First method section: 1
//First method section: 0
//Second method section: 0
//Second method section: 1
//Second method section: 2
//Second method section: 3
//Second method section: 4

//        Bet sitas reikalas pavojingas, jo reikia vengti

    }
}
