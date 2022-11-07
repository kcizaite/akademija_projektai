package lt.techin.karolina.comparator.enums;

import java.util.Arrays;

public class MainForTest {
    private static final String NAME = "Karolina";

    public static void main(String[] args) {
        Planets planet;
        planet = Planets.MERCURY; // Per . gausime tik tai ka galime naudoti
        System.out.println(planet); // print MERCURY
        planet = Planets.EARTH;
        System.out.println(planet); // print EARTH (spausdina paskutini)
        if (planet == Planets.EARTH) {
            System.out.println(planet + " is our home");
        } else {
            System.out.println("Not ");
        } // print EARTH is our home

        planet = Planets.MARS;
        switch (planet) {
            case MARS:
                System.out.println(" It is " + planet);
                break;
            case EARTH:
                System.out.println(" It is " + planet);
            default:
                System.out.println("___");
        } // print  It is MARS

//        Suzinoti visa masyva
        Planets[] solarSystem = Planets.values();
        System.out.println(Arrays.toString(solarSystem)); // print [MERCURY, VENUS, EARTH, MARS]
//        Suzinoti ar yra tem tikras elementas isvardinime
        System.out.println(Planets.valueOf("EARTH")); // print EARTH
//        System.out.println(Planets.valueOf("Labas")); // print java.lang.IllegalArgumentException
        System.out.println(Planets.EARTH.getMass()); // print 1.0

        for (Planets element : Planets.values()) { // SVARBI VIETA !!!
            System.out.println(element + ": " + element.getMass());
        }
//      print MERCURY: 0.06
//            VENUS: 0.81
//            EARTH: 1.0
//            MARS: 0.11
    }
}
