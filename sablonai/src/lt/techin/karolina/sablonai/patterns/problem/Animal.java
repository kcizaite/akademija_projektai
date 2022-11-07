package lt.techin.karolina.sablonai.patterns.problem;

public abstract class Animal {
    void makeSound(){
        System.out.println("Animal make sound ...");
    }

    abstract void run();
//    abstract void fly(); // Karves pas mus negali skraidyti
}
