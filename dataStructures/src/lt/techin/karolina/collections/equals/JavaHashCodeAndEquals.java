package lt.techin.karolina.collections.equals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaHashCodeAndEquals {
    public static void main(String[] args) {

//        Map<Integer, String> hasMap = new HashMap<>();
//        Set<Integer> hashSet = new HashSet<>();
//        hasMap.put(1, "Karve");
//        hasMap.put(2, "Suo");
//        hashSet.add(1);
//        hashSet.add(2);
//        System.out.println(hasMap); // print {1=Karve, 2=Suo}
//        System.out.println(hashSet); // print [1, 2]

        // Person susikuria klase
        Map<Person, String> hasMap = new HashMap<>();
        Set<Person> hashSet = new HashSet<>();
        Person person1 = new Person(1, "Karolina");
        Person person2 = new Person(1, "Karolina"); // print {Person{id=1, name='Karolina'}=VIP, Person{id=1, name='Karolina'}=VIP}
//        Person person2 = new Person(2, "Rima");
        System.out.println(person1 == person2); // print false
        System.out.println(person1.equals(person2)); // print false, su tuo mandru override tai true sitas gaunasi

        hasMap.put(person1, "VIP");
        hasMap.put(person2, "VIP");
        hashSet.add(person1);
        hashSet.add(person2);

        System.out.println(hasMap);
        System.out.println(hashSet);
    }
}
