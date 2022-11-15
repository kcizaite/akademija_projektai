package lt.techin.karolina.pattern.strategy;

public class PrinterImpl implements Printer{

    private PrintingStrategy strategy;

    public PrinterImpl(PrintingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PrintingStrategy strategy) {
        this.strategy = strategy;
    }

    public void print(){
        System.out.println("Start printing");
        strategy.print();
    }
}
