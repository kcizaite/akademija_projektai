package lt.techin.praktika1;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a = " + a + ", b = " + b);
//        1 method (dezuciu keitimas) -> naudojamas paieskos algoritmuose, mazai naudojame resursu
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a + ", b = " + b);
//        2 method (artimetiskai)
        a = a + b; // a += b
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
//        3 method (daugyba ir dalyba)
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a = " + a + ", b = " + b);
//        4 method (byte) -> efektyviausias, nes nieko nekopijuojam ir neperdedam, naudojam tik duotus 2 int
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + ", b = " + b);
//        Nuorodu keitimas (pades tik dezuciu metodas)
        String str1 = "Katinas";
        String str2 = "Suo";
        System.out.println("str1 = " + str1 + ", str2 = " + str2);
        String tmp1 = str1;
        str1 = str2;
        str2 = tmp1;
        //        Cia pakeiteme nuorodas, nes objektus (ir ne turini)
        System.out.println("str1 = " + str1 + ", str2 = " + str2);

    }
}
