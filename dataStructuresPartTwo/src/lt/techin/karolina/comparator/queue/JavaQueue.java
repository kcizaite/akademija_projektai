package lt.techin.karolina.comparator.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class JavaQueue {
    public static void main(String[] args) {
//        FIFO => first in, first out
        Child child1 = new Child(5);
        Child child2 = new Child(2);
        Child child3 = new Child(8);
        Child child4 = new Child(3);
        Queue<Child> list = new LinkedList<>(); // LinkedList = suristu elementu sarasas, eilute
        list.add(child3);
        list.add(child1);
        list.add(child4);
        list.add(child2);
//        Atspausdiname sudejimo tvarka
        System.out.println(list); // print [Child{id=8}, Child{id=5}, Child{id=3}, Child{id=2}]
//        .remove() istrauks mums vaika :)
        System.out.println(list.remove()); // print Child{id=8}
        System.out.println(list); // print [Child{id=5}, Child{id=3}, Child{id=2}]
//        .poll() skirtumas nuo .remove(), kad pabaigoje kai nieko neliks .remove() raso exception, o .poll() duoda null
        System.out.println(list.poll()); // print Child{id=5}
        System.out.println(list); // print [Child{id=3}, Child{id=2}]
        System.out.println(list.poll()); // print Child{id=3}
        System.out.println(list.poll()); // print Child{id=2}
        System.out.println(list.poll()); // print null
        System.out.println(list.poll()); // print null
        System.out.println(list); // print []

        Queue<Child> queue = new ArrayBlockingQueue<>(4); // Su ArrayBlockingQueue<> nurodome is anksto, kad eilute bus 4 numeriu
        queue.add(child1);
        queue.add(child2);
        queue.add(child3);
        queue.add(child4);
        queue.add(child1);
        System.out.println(queue); // print java.lang.IllegalStateException
    }
}
