package lt.techin.karolina.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSet {
    public static void main(String[] args) {
        // Set yra aibe arba unikaliu elementu sarasas, todel besikartojantys duomenys NESISPAUSDINA
        Set<String> hashSet = new HashSet<>(); // No order -> negarantuoja eiliskumo
        Set<String> linkedHashSet = new LinkedHashSet<>(); // Ordered -> rusiuoja kaip sudeta
        Set<String> treeSet = new TreeSet<>(); // Sorted -> rusiuota struktura
        // HashSet
        hashSet.add("Karolina");
        hashSet.add("Stela");
        hashSet.add("Laime");
        hashSet.add("Dziaugsmas");
        hashSet.add("Dziaugsmas");
        // LinkedHashSet
        System.out.println(hashSet); // print [Laime, Dziaugsmas, Karolina, Stela]
        linkedHashSet.add("Karolina");
        linkedHashSet.add("Stela");
        linkedHashSet.add("Laime");
        linkedHashSet.add("Dziaugsmas");
        linkedHashSet.add("Dziaugsmas");
        System.out.println(linkedHashSet); // print [Karolina, Stela, Laime, Dziaugsmas]
        // TreeSet
        treeSet.add("Karolina");
        treeSet.add("Stela");
        treeSet.add("Laime");
        treeSet.add("Dziaugsmas");
        treeSet.add("Dziaugsmas");
        System.out.println(treeSet); // print [Dziaugsmas, Karolina, Laime, Stela] // Natural order

        // AIBES
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);
        // Union (unikalios reiksmes)
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println(union); // print [1, 2, 3, 4, 5, 6]
        // Intersection (aibiu sankirta)
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println(intersection); // print [3, 4]
        // Difference
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println(difference); // print [1, 2], jei sukeisime setA ir set B vietomis print bus [5, 6]
    }
}
