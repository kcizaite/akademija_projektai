package lt.techin.karolina.collections.comporator;

import lt.techin.karolina.collections.equals.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class JavaComparator{
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Papuga");
        animals.add("Kregzdute");
        animals.add("Dramblys");
        animals.add("Uodas");
        animals.add("Pele");
        System.out.println(animals); // print [Papuga, Kregzdute, Dramblys, Uodas, Pele]
        Collections.sort(animals);
        System.out.println(animals); // print [Dramblys, Kregzdute, Papuga, Pele, Uodas]
        Collections.sort(animals, new StringComparator());
        System.out.println(animals); // print [Pele, Uodas, Papuga, Dramblys, Kregzdute] => pagal ilgis
//        Galime tai susikurti ir cia vietoje:
//        Collections.sort(animals, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Tomas"));
        persons.add(new Person(2, "Akvile"));
        persons.add(new Person(3, "Ernesta"));
        Collections.sort(persons);
        System.out.println(persons); // print [Person{id=1, name='Tomas'}, Person{id=2, name='Akvile'}, Person{id=3, name='Ernesta'}]
    }


}
