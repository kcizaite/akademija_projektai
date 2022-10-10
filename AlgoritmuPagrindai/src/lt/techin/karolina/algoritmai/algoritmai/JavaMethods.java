package lt.techin.karolina.algoritmai.algoritmai;


import java.util.Arrays;
import java.util.Random;

public class JavaMethods {
//        METODAI == F-JOS
//        Modifikatoriai -> prieigos, kurias draudziame arba leidziame
//        tipas -> int, void ir t.t. -> atliekam kazkoki metoda, kuris mums tai grazina
//        name -> metodas, turi rodyti koki veiksma atlieka: pvz. sumTheNums
//        parametrai -> ka metodas priima, masyvas parametru
//        name ir parameters yra metodo unikalumas

//    Kad isvengti daug kartu rasymo ir trinimo pacios programos, rasome ji statini (objektas)
    public static Random rnd = new Random();

    public static void main(String[] args) {
        System.out.println(getRandomNumber());
    }

//        Modifikatoriai yra neprivalomi, bet be static neleis psvm dalyje rasyti getRandomNumber()
    static int getRandomNumber() {
        return rnd.nextInt();
    }

}
