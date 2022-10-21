package lt.techin.karolina.praktikosdiena.pcExample;

import org.w3c.dom.ls.LSOutput;

public class MainClient {
    public static void main(String[] args) {
        // Computer: 2 CPU, 4GB, 128GB SSD, no graphic card required
        Processor cpu = new Processor(2500, 4);
        Memory ram = new Memory(8196, 2400);
        Storage disc = new Storage(128, "SSD");
        Laptop apple = new Laptop(cpu, ram, disc, 1.5);
        System.out.println(apple);
        Tester karolina = new Tester();
        karolina.computerTested(apple);
    }
}
