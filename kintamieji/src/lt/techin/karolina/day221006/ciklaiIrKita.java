package lt.techin.karolina.day221006;

public class ciklaiIrKita {
    public static void main (String [] args) {

//        __________
//        MATH KLASE - NATYVIAI
        int num = 10;
        System.out.println(Math.floor(2)); // print 2.0
        System.out.println(Math.pow(num, 2)); // print 100.0
//        Gavome .0, todel, kad tai pakeisti panaudojant KASTINIMA
        System.out.println((int) Math.pow(num, 2)); // print 100
        System.out.println(Math.pow(num, 2.5)); // print 316.22776601683796, nes pagal documentacija, tai keliame double, ne int
        int num1 = 56;
        System.out.println(Math.max(num, num1)); // print 56

//        _________________________________________________________________
//        IF, ELSE, ELSE IF, SWITCH, WHILE, DO/WHILE, FOR, FOR/EACH, RETURN
//        Switch metodas yra greitesnis uz if, if eina per viska, bet switch reikia break
//        While naudojame, kai reikia salygos atitikimo (jei banke neatitiksi kriteriju, niekas su tavimi nekalbes)
//        Do/While -> kaip greitieji kreditai, duoda - tada ziuri salygas

//        __FOR__
//        for((nuo kiek);(iki kiek);(iteraciju skaicius))
//        for (int = 1; int < 1; i++) {
//        }
        int counter = 0;
        for (; ; ) {
            if (counter == 10) {
                break;
            }
            System.out.println(counter + "Labas");
            counter++;
        }

//        for (method1();method2();method3()) {
//        }
//        Galime daug metodu ideti, laikus, datas ir panasiai

//        __FOR EACH__
//        automatiskai suka skaitliuka, nereikia mums deti, kad +1 ir t.t.
//        for (:) {
//
//        }

//        __RETURN__
//        VOID grazina NIEKO, bet grazina
        System.out.println(add(10, 20));
    }
    public static int  add (int a, int b) {
        return a + b;
    }

}
