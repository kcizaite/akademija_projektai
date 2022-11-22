package lt.techin.karolina.numbersProject;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;

public class ExercisesImpl implements Exercises {
    List<Integer> integers = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();

    @Override
    public Integer findSmallest(List<Integer> list) {
        int smallestNumber = Integer.MAX_VALUE;
        for (Integer integer : list) {
            if (integer < smallestNumber) {
                smallestNumber = integer;
            }
        }
        return smallestNumber;
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        int largestNumber = Integer.MIN_VALUE;
        for (Integer integer : list) {
            if (integer > largestNumber) {
                largestNumber = integer;
            }
        }
        return largestNumber;
    }

    @Override
    public boolean isEqual(Object lhs, Object rhs) {
        return lhs.equals(rhs);
    }

    @Override
    public boolean isSameObject(Object lhs, Object rhs) {
        return lhs == rhs;
    }

    // TODO
    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        return null;
    }

    @Override
    public int computeSumOfNumbers(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    // TODO
    @Override
    public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
        return 0;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int number) {
        for (int i = 1; i < number; i++) {
            integers.add(i);
        }
        return integers;
    }



    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        for (Integer list1 : list) {
            if (map.containsKey(list1)) {
                map.put(list1, map.get(list1) + 1);
            } else {
                map.put(list1, 1);
            }
        }
        return map;
    }

    // TODO
    @Override
    public IntegerGenerator createIntegerGenerator(int from, int to) {
        return new IntegerGen();
    }


    // TODO
    @Override
    public IntegerGenerator createFilteredIntegerGenerator(
            IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return null;
    }
}
