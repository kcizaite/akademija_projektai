package lt.techin.karolina.sablonai.patterns.singleton;

import java.util.List;
import java.util.ArrayList;

public class PrintSpooler {
    private static final PrintSpooler PRINT_SPOOLER = new PrintSpooler(); // Paprastesnis unikalumo uztikrinimas
    private static boolean initialized = false;

    private PrintSpooler() {
    } // Privatus konstruktorius

    public void start() {
        System.out.println("Spooler initialized ...");
    }

    public static synchronized PrintSpooler getInstance() {
        if (initialized) {
            return PRINT_SPOOLER;
        } else {
            PRINT_SPOOLER.start();
            initialized = true;
            return PRINT_SPOOLER;
        }
    }

    public void print(List<String> list) {
        System.out.println("Printing ...");
        System.out.println(list);
    }
}
