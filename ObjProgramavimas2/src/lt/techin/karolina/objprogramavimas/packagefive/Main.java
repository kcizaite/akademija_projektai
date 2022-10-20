package lt.techin.karolina.objprogramavimas.packagefive;

public class Main {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Bona", 4);
        Birds bird1 = new Birds("Kestutis", false);
        dog1.sound(); // nereikia, nes suo ir taip turi sout
        bird1.sound();
    }
}
