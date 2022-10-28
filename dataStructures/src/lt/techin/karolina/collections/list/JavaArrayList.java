package lt.techin.karolina.collections.list;

import java.util.List;
import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        // Array
//        int[] numbers = new int[3];
//        for (int i = 0; i < 4; i++){
//            System.out.println(numbers[i]); // print java.lang.ArrayIndexOutOfBoundsException
//        }
        // Wrapper class Integer -> int
        List<Integer> numbers = new ArrayList<>(); // 10 default elements
        for (int i = 0; i < 10; i++){
            numbers.add(i);
        }
        numbers.add(24);
        System.out.println(numbers); // print [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 24]
        System.out.println(numbers.size()); // print 11
        for(Integer number:numbers){
            System.out.println(number); // print skaicius po viena
        }
        numbers.remove(5); // print [0, 1, 2, 3, 4, 6, 7, 8, 9, 24]
        System.out.println(numbers);
        System.out.println(numbers.contains(24)); // print true
    }
}
