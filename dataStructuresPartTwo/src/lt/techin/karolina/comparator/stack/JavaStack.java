package lt.techin.karolina.comparator.stack;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
//        LIFO
        Stack<Integer> lifo = new Stack<>();
        lifo.push(1); // .push() daro pridejima
        lifo.push(5);
        lifo.push(8);
        lifo.push(2);
        System.out.println(lifo); // print [1, 5, 8, 2]
//        Galime isimti skaiciukus su .pop()
        System.out.println(lifo.pop()); // print 2
        System.out.println(lifo); // print [1, 5, 8]
//        .peek() mums parodo paskutini skaiciu, taciau neisima
        System.out.println(lifo.peek()); // print 8
        System.out.println(lifo); // print [1, 5, 8]
//        System.out.println(lifo.pop()); // print 8
//        System.out.println(lifo.pop()); // print 5
//        System.out.println(lifo.pop()); // print 1
//        System.out.println(lifo); // print []
//        System.out.println(lifo.pop()); // print java.util.EmptyStackException
//        Kad negauti tokios klaidos, naudojame while loopá
        while (!lifo.isEmpty()) {
            System.out.println(lifo.pop());
        }
        System.out.println("PABAIGA");
    }
}
