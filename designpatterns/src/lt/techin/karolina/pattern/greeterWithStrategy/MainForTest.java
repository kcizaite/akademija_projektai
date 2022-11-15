package lt.techin.karolina.pattern.greeterWithStrategy;

public class MainForTest {
    public static void main(String[] args) {
    Greeter greeter = new Greeter(new LithuanianGreeter());
    greeter.greet("Karo", "Lina");
    }
}
