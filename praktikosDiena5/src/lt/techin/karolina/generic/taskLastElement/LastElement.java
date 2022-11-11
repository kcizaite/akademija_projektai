package lt.techin.karolina.generic.taskLastElement;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LastElement {
    List<Shape> listOfShapes = new ArrayList<>();

    //    Shape lastShape = ElementUtils.lastElement(listOfShapes);
    //    List<String> wordList = ...;
    //    String lastWord = ElementUtils.lastElement(wordList);
    public static void lastElement(List<Shape> list) {
        System.out.println(list.lastIndexOf(0));
    }
}
