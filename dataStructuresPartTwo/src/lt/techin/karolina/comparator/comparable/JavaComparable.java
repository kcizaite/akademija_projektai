package lt.techin.karolina.comparator.comparable;

import java.util.*;
// Patys sugalvojame kaip norime lyginti
public class JavaComparable {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();

        addPerson(personList);
        System.out.println(personList);
        addPerson(personSet);
        System.out.println(personSet);

    }
//    Collection -> interface skaitosi
    private static void addPerson(Collection<Person> collection) {
        collection.add(new Person(1, "Dovile"));
        collection.add(new Person(2, "Toma"));
        collection.add(new Person(3, "Tautvydas"));
        collection.add(new Person(4, "Karolis"));

    }
}
