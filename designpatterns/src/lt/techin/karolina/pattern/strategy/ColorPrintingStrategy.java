package lt.techin.karolina.pattern.strategy;

public class ColorPrintingStrategy implements PrintingStrategy{
    @Override
    public void print() {
        System.out.println("Color printing");
    }
}
