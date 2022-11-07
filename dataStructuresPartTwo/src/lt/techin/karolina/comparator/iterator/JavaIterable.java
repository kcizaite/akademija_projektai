package lt.techin.karolina.comparator.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaIterable {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
//        After Java 5
//        for (Integer element : numbers) {
//            numbers.remove(1);
//            System.out.println(element); // print java.util.ConcurrentModificationException
//            Taip nutinka, todel, kad cia dirbame su nuoroda. Taip pat foreach turi savo vidini skaitliuka (+1, +1...)
//        }
//        Before Java 5
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(numbers); // print []
    }
}
