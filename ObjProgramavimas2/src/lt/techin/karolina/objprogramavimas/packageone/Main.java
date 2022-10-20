package lt.techin.karolina.objprogramavimas.packageone;

import lt.techin.karolina.objprogramavimas.packagetwo.Class2;

public class Main extends Class2 {
    public static void main(String[] args) {
        Class1 c1 = new Class1(); // Same package
//        System.out.println(c1.n1); // private - sito nepasiekia
        System.out.println(c1.n2); // default
        System.out.println(c1.n3); // protected
        System.out.println(c1.n4); // public

        Class2 c2 = new Class2(); // Other package
//        System.out.println(c2.n1); // private - sito nepasiekia
//        System.out.println(c2.n2); // default - sito nepasiekia
//        System.out.println(c2.n3); // protected - sito nepasiekia
//        Tam kad veiktu protected rasome prie Main extends Class2 + Main klase nauja
        Main mn = new Main();
        System.out.println(mn.n3);
        System.out.println(c2.n4); // public

//        Class3 c3 = new Class3(); // Other package
////        System.out.println(c2.n1); // private - sito nepasiekia
////        System.out.println(c2.n2); // default - sito nepasiekia
////        System.out.println(c2.n3); // protected - sito nepasiekia
//        System.out.println(c3.n4); // public
    }
}
