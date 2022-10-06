package lt.techin.karolina.day221006;

//      Metodo viduje turi kiekvienas kintamasis tureti savo reiksme

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//      ______________________
//      MATEMATINES OPERACIJOS
        int a = 7;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(b / 2);
//        liekana po dalybos
        System.out.println(a % b);
//        print 28, nes c yra dezute, i kuria susideda du veiksmai:
//        (a++ = 7 + 1, taciau sitame expresione jis prioriteto neturi)
//        + (++b = 20), taigi gaunasi +1 po statement REZULTATAS 7 (+1) +1 + 20
        int c = (a++) + (++b); /* su - gausime rezultata -14 */
        System.out.println("a: " + (a++));
        System.out.println(a++); /* print 8 */
        System.out.println(c);
//        a = 8, b = 21 jau turime, todel
//        -1 + 8 + 21 + 7
        c = --a + b-- + a++;
        System.out.println(c); /* print 37 */
        System.out.println("a: " + a + ", b: " + b);
        c = a % b + a++;
//        8 + 8 ir a +1
        System.out.println(c);
        System.out.println(a);
//        System.out.println(a / 0);
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//	        at lt.techin.karolina.day221006.Main.main(Main.java:31)

//        ______________________
//        PALYGINIMO OPERATORIAI
        int d = 13;
        int e = 15;
        System.out.println(d == e);
        System.out.println(d > e);
        System.out.println(d < e);
        System.out.println(d != e);
        System.out.println(d >= e);
        System.out.println(d <= e);

//        __________________
//        BITINES OPERACIJOS (naudojamos teisems, kurias suteikiame operatoriams, sifravimui, jei norime, kad skaiciai butu sudedami greiciau)
//        int = 4B
        int bit1 = 0b0101; // Pagal binarine sistema cia reiskia 5
        int bit2 = 0b1010; // Cia reiskia 10
//      & (ir):  rezult = 0b0000 // 0 -> tiesa tada kai turime iejime du 1
        System.out.println(bit1 & bit2); // print 0
//      | (arba): result = 0b1111 // 1 + 2 = 3 + 4 = 7 + 8 = 15
        System.out.println(bit1 | bit2); // print 15
//      ^ (isskirtinis) cia 1 ir 1 = 0, o 0 ir 0 = 0: result = 0b1111 // vel 15
        System.out.println(bit1 ^ bit2);
//      ~ (neigimas): result = 0b1010 (jeigu buvo 0, taps 1, jei 1 taps 0)
//        int bus - zonoje
        System.out.println(~bit1); // print -6
//      >> (postumis i desine/kaire): result
        int bit3 = 5;
        System.out.println(1 >> bit3); // print 0
        System.out.println(bit3 >> 1); // print 2, nes 0b0101 -> (>1) -> 0b0010
        System.out.println(bit3 << 1); // print 10, nes 0b0101 -> (<1) -> 0b1010
        System.out.println(bit3 >>> 1); // print 2, nes visi nunulinami
//   NAMU DARBAS
        int numx = 10;
        int numy = 20;
//        reikia sukeisti vietomis
//        3 budai yra tam, vienas is ju yra su bitinemis operacijomis

//        _______
//        BOOLEAN
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 && b1); // jeigu bent vienas false, tai toliau netikrina
        System.out.println(b1 || b2); // jei pirmas true, toliau netikriname
//        Kam to reikia? Trumpinti operaciju laika
//        package.class.metodas(arg1) && package.class.metodas(args2)
//        Kam eiti per viska, jeigu iskart galime pamacius, kad nera failo ir nereikia toliau ieskoti
        System.out.println(!b2); // print true, pakeis tiesiog

//        ______________________
//        PRISKYRIMO OPERATORIAI
        double db1 = 10.4; // priskiriu skaiciu
        db1 += 100;
        System.out.println(db1); // print 110.4
        db1 -= 100;
        System.out.println(db1); // print 10.400000000000006
        db1 /= 2;
        System.out.println(db1); // print 5.200000000000003
        db1 *= 10;
//       Del tokiu paklaidu, finansinems operacijoms double nenaudojamas
        db1 %= 5;
        System.out.println(db1); // print 2.0000000000000284
//        Bitines operacijos neveikai su double, nes tik sveiki skaicia tinkami
        int kazkas = 1;
        kazkas <<= 1;
        System.out.println(kazkas); // print 2
        kazkas >>= 1;
        System.out.println(kazkas); // print 1
        kazkas &= 0b0101; // galime iskart binarine forma naudoti
        System.out.println(kazkas); // print 1

//        __________________________
//        DUOMENU TIPO KONVERTAVIMAS
//        SAUGUS KONVERTAVIMAS
//        I didesne dezute deti mazesni skaiciu yra saugu
//        NESAUGUS KONVERTAVIMAS+
        int in1 = 1024;
        byte bt4 = (byte) in1;
        System.out.println(bt4); // print 0
//        jei int 1023 = -1, jei 1025 = 1
//        Jis bando italpinti dezutes, kiek lieka tiek palieka, ciklas gaunasi
//        AUTOMATINIS DUOMENU KONVERTACIMAS
        byte z = 1;
        byte w = 2;
        byte y = (byte) (a + b);
        System.out.println("y: " + y); // y: 31

//        float f1 = 1d + 1f; -> iskart mes kaip klaida, negalimas kastingas, tikslumas dings
        float fl = (float) 1.0d + 1.0f;
        System.out.println(fl);

//        ______
//        STRING
//        Nors ir aprasome string kaip char masyva, taciau vienas string yra vienas duomenu kiekis, nedalijamas,
//        vientisas objektas
        String name = "Katinas"; // irasome i string pool'a, java toki dalyka turi
        System.out.println(name.length()); // print 7
        System.out.println(name.getBytes()); // print [B@62043840 (cia ne byte, o nuoroda), todel ->
        System.out.println(Arrays.toString(name.getBytes())); // print [75, 97, 116, 105, 110, 97, 115]
        System.out.println(name.toLowerCase()); // sukuria nauja objekta ir mes gauname nuoroda i ja // print katinas
        System.out.println(name.indexOf(0)); // print -1
        System.out.println(name.indexOf(1)); // print -1
        System.out.println(name.indexOf("K")); // print 0
//        PALYGINIMAS
        String name1 = "Katinas"; // String pool
        String name2 = "Katinas";
        System.out.println(name1 == name2); // print true
        String name3 = new String("Katinas");
        String name4 = new String("Katinas");
        System.out.println(name3 == name4); // print false
        System.out.println(name3.equals(name4)); // print true -> cia ziuri i turini

//        ____
//        CHAR
        char c1 = '\u6565'; // char nebutinai turi buti tiesiniai
        System.out.println(c1); // print 敥

//        Kad apjungti, kelis STRING naudojame concat arba stringbuilderi
//        StringBufferis yra geriausias, nes sinchronizuotas
//        StringTokenizer panasiai veikia, kaip split, bet ir eina su juo keisti zodzius, pvz. galime naudot uztusuojant keiksmazodzius i *** chatuose

    }
}
