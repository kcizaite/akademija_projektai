package lt.techin.karolina.pattern.greeterWithStrategy;

public class Greeter {
    private GreeterLanguageStrategy greeterLanguageStrategy;

    public Greeter(LithuanianGreeter lithuanianGreeter) {
    }

    public void greet (String firstName, String lastName){
        System.out.println(greeterLanguageStrategy + firstName + " " + lastName);
    }
}
