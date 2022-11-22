package lt.techin.karolina.numbersProject;

import lt.itakademija.exam.IntegerGenerator;

import java.util.Random;

public class IntegerGen extends ExercisesImpl implements IntegerGenerator {

    Random random = new Random();

    @Override
    public Integer getNext() {
        int to = 0;
        int from = 0;
        createIntegerGenerator(from, to);
        return random.nextInt((to - from) + 1) + from;
//        return random.nextInt();
    }

}
