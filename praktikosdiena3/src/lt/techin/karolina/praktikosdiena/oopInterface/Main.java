package lt.techin.karolina.praktikosdiena.oopInterface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box[] boxes = {
          new Box(10, 1, 1),
          new Box(1, 10, 1),
          new Box(1, 10, 10)
        };
        System.out.println(Arrays.toString(boxes));
//        Dezuciu rusiavimas
        Arrays.sort(boxes);
        System.out.println(Arrays.toString(boxes));
        for (Box box: boxes) {
            System.out.println(box);
        }
    }
}
