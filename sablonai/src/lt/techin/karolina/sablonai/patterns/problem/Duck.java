package lt.techin.karolina.sablonai.patterns.problem;

public class Duck extends Animal implements Flyable{
    @Override
    void run() {
        System.out.println("Duck is run ...");
    }

    @Override
    public void fly() {

    }
}
