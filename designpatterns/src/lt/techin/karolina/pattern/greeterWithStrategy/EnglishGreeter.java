package lt.techin.karolina.pattern.greeterWithStrategy;

import lt.techin.karolina.pattern.greeterWithTemplateMethod.Greeter;

public class EnglishGreeter extends Greeter {
    public String getGreetingString(){
        return "Hello ";
    }
}
