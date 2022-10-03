package lt.techin.karolina.skaidres54;

public class Variables {

    //  Visi kintamieji turi pradine reiksme (be 0 gausime rezultata 0, bet gerai ivesti kazkokia verte):
    static int intNumber = 0;
    //  Be vertes gausime null reiksme
    static String name = "Karolina";
    //  Konstanta, kurios pakeisti negalima
    private static final int INTNUMBER = 0;


    public static void main(String[] args) {

        System.out.println(intNumber);
        System.out.println(name);
//      Cia be vertes neleis paleisti, pats mes, kad bent null reikia ivesti
        String treeName = "";
//      Deklaruotas, bet neincelizuotas, todel tokius reikia istrinti
        String flowerName;
        System.out.println(treeName);
        System.out.println(name);
//      Galime rasyti bloka i vidu, pvz. diagnostikai
        {
            System.out.println("Labas");
        }
//      Sitas jau neveiks, nes nepakeisim konstantos
//        INTNUMBER = 2;
//      Galime ir taip rasyti (cia kazkoks skirtumas, kuri praleidau :) )
        String houseName;
        System.out.println(houseName="0");

    }

}
