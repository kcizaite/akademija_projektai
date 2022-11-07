package lt.techin.karolina.comparator.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Skirtas lyginti pagal default arba musu paciu sugalvotus parametrus (kitos klases cia kur prirasytos), taip pat naudojamas kitiems zmonems atejus ir dirbant su tavo codu
public class JavaComporator {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Frog");
        animals.add("Bird");
        animals.add("Cat");
        System.out.println(animals); // print [Dog, Frog, Bird, Cat]
        Collections.sort(animals); // surusiuojam i naturalia tvarka
        System.out.println(animals); // print [Bird, Cat, Dog, Frog]
        Collections.sort(animals, new StringComparator());
        System.out.println(animals); // print [Cat, Dog, Bird, Frog]
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(-28);
        numbers.add(12);
        numbers.add(128);
        System.out.println(numbers); // print [45, -28, 12, 128]
        Collections.sort(numbers);
        System.out.println(numbers); // print [-28, 12, 45, 128]
        Collections.sort(numbers, new IntegerComporator());
        System.out.println(numbers); // print [128, 45, 12, -28] -> su klase IntegerComp padarem, kad mums didejancia tvarka rusiuotu
    }
}
