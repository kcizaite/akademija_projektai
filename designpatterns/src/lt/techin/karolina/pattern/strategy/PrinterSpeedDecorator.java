package lt.techin.karolina.pattern.strategy;

public class PrinterSpeedDecorator implements Printer{

    Printer printer;
    public PrinterSpeedDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        System.out.print("Fast printing");
        printer.print();
    }
}
