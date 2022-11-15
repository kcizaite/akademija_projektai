package lt.techin.karolina.pattern.greeterWithTemplateMethod;

public class MainToTest {
    public static void main(String[] args) {
        Greeter greeterLith = new LithuanianGreeter();
        greeterLith.greet("Karo", "Lina");
        Greeter greeterEngl = new EnglishGreeter();
        greeterEngl.greet("Karo", "Lina");

// strategy
// Greeter greeter = new Greeter (new LithGreetingStrategy));
// greeter.greet("Karo", "Lina");
    }
}