package lt.techin.karolina.praktikosdiena2;

import java.util.Arrays;

public class JavaAppendMassives {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {1, 2, 3, 4, 5};

        int[] last = {};;
        int counter = 0;
        for (int number : first) {
            last[counter++] = Integer.parseInt(String.valueOf(number));
            System.out.println(Arrays.toString(last));
//            for (int numberz : second) {
//                last[counter++] = Integer.parseInt(String.valueOf(numberz));
//                System.out.println(Arrays.toString(last));
//            }
        }



    }

}