package lt.techin.karolina.pattern.strategy;

public class App {
    public static void main(String[] args) {
//        PrinterImpl printer = new PrinterImpl(new ColorPrintingStrategy());
//        printer.print();
//        printer.setStrategy(() -> System.out.println("Black printing")); // F-nis interface, toje pacioje vietoje susikuria
//        printer.print();
        Printer printer = new PrinterImpl(new ColorPrintingStrategy());
        printer = new PrinterSpeedDecorator(printer);
        printer.print();
        // print spausdinu greitai: Start printing
        // print Color printing
    }
}
