package lt.techin.karolina.skaidres54;

class JavaByte {
    public static void main(String[] args) {
//        byte byteOne = 127; perpildymas
        short number = 127;
//        bytOne++;
        number++;
//        System.out.println(byteOne);
        System.out.println(number);

        int num1 = 0b101010;
//        Tokie reikalingi yra
        System.out.println(num1);

        double num2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(num2);

        byte num3 = 125;
        byte num4 = 3;
//        KASTINIMAS - privertimas, nes be (byte) jis galvos, kad int susidet nori
        byte result = (byte) (num3 + num4);
        System.out.println(result);

//        Is mazesniu i didesnius galime deti, is didesniu i mazesnius ne :)
        long num5 = 10L;
        long num6 = 100;
        long result1 = num5 + num6;
        System.out.println(result1);

        double db1 = 1.0;
        double db2 = 0.0;
        System.out.println(db1 / db2);
//        print infinity

//        baNaNas
        double db3 = 0.0;
        double db4 = 0.0;
        System.out.println("ba" + db3 / db4 + "as");

        boolean k1 = true;
        boolean k2 = false;
//        & = IR, o && = tingus IR -> jeigu pirmas k1 = FALSE, tai toliau netikrins, bet pas mus TRUE, tai ir ziurim,
//        visada tikrina is KAIRES, || = tingus arba, jeigu pirmas TRUE, tai ir bus TRUE, jeigu FALSE, toliau tikrins
        System.out.println(k1 || k2);

//        int num = Integer.kazkoks pasirinkimas -> cia tie vadinamieji kevalai
        Integer num7 = 10;
        System.out.println(num7.byteValue());



    }
}