package lt.techin.karolina.sablonai.patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
        PrintSpooler printSpoolerOne = PrintSpooler.getInstance();
        PrintSpooler printSpoolerTwo = PrintSpooler.getInstance();
//        Uzsitikrinam, kad vienintelis
        System.out.println(printSpoolerTwo); // print lt.techin.karolina.sablonai.patterns.singleton.PrintSpooler@2133c8f8
        System.out.println(printSpoolerOne); // print lt.techin.karolina.sablonai.patterns.singleton.PrintSpooler@2133c8f8
        System.out.println(printSpoolerOne.equals(printSpoolerTwo)); // print true
        printSpoolerOne.start();
        List<String> names = new ArrayList<>();
        names.add("Eva");
        names.add("Karolis");
        names.add("Tommy");
        names.add("Danguole");
        printSpoolerOne.print(names);
        printSpoolerTwo.print(names);
    }
}
