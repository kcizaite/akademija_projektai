package lt.techin.karolina.oop;

public class Main {
    public static void main(String[] args) {
        Test test = new Test(); // vardas, kuris surisa su pavadinimu, reff - nuoroda
        System.out.println(test); // print lt.techin.karolina.oop.Test@2133c8f8 -> po @ serverio name
//        test.x = 10; su public
        test.setX(10); // public atviras visam pasauliui, protected uzdaras nuo viso pasaulio, bet atviras tai klasei, jo palikuonims??, private tik savo klasei, default tik paketo viduje -> incapsuliacija defalt yra
        System.out.println(test.getX());
//        System.out.println(test.x); // print 10, su public
        System.out.println(test); // print Test{x=0}, kai idedam override ta ilgesne versija
        System.out.println(test); // print x=10 , kai pakeiciam i return "x=" + x;
        System.out.println(test.hashCode()); // print 357863579
        System.out.println(test.getClass()); // print class lt.techin.karolina.oop.Test
        Test test2 = new Test();
        test2.setX(10);
        System.out.println(test.equals(test2)); // false, nes JAVA nezino pagal ka lygina
        String name1 = new String("Tomas");
        String name2 = "Tomas";
        System.out.println(name1.equals(name2));
        System.out.println(name1 == name2); // print false, nes NUORODOS
    }
}
