package lt.techin.karolina.collections.linkedList;

import java.util.*;

public class JavaLinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>(); // Cia yra dinaminis masyvas
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers); // print [1, 2, 2, 3, 4]
        System.out.println(numbers.get(2)); // print 2
        System.out.println(numbers.size()); // print 5
        System.out.println(numbers.contains(5)); // print false

        // Kada kuri listá naudoti?
        List<Integer> arrayList = new ArrayList<>(); // <Integer> reiskia, kad tokio tipo listas bus
        List<Integer> linkedList = new LinkedList<>();

        measureTime(arrayList);
        measureTime(linkedList);
    }

    private static void measureTime(List<Integer> list) {
        for (int i = 0; i < 100_000; i++){
            list.add(i); // Paimame lista ir i ji idedame ta skaiciu i
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++){
//            list.get(i);
//            list.add(0, i);
            list.remove(100);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + "mS");
        //.add = ArrayList = 20 mS, LinkedList = 120 mS
        //.get = ArrayList = 1 mS, LinkedList = 3330 mS
        //.add(0, i) = ArrayList = 1461 mS, LinkedList = 4 mS
        //.remove = ArrayList = 87 mS, LinkedList = 3 mS
        // __________________________________________________
        // ARRAYLIST -> greitas skaitymui
        // LINKEDLIST -> greitas keisti
    }
}
