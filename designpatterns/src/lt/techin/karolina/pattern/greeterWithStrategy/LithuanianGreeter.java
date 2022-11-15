package lt.techin.karolina.pattern.greeterWithStrategy;

import lt.techin.karolina.pattern.greeterWithTemplateMethod.Greeter;

public class LithuanianGreeter extends Greeter {
    public String getGreetingString(){
        return "Labas ";
    }
}
