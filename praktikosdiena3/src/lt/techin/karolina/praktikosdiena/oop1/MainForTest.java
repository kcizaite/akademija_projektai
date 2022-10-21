package lt.techin.karolina.praktikosdiena.oop1;

import java.util.Arrays;

public class MainForTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("Rectangle 1", 10, 10, 12, 16);
        Circle c1 = new Circle("Circle 1", 50, 50, 12);
//        Shape sh1 = new Shape(); = negalime, nes abstract nustatyta
        Triangle tr1 = new Triangle("Triagle 1", 25, 25, 23, 78);
        System.out.println(r1); // print Rectangle 1: x = 10, y = 10, a = 12, b = 16
        System.out.println(c1); // print Circle 1: x = 50, y = 50r=12
        Shape[] shapes = {
//                Objektu nuorodos zemiau // masyvas
                r1,
                c1,
                tr1,
                new Circle("Circle 2", 100, 100, 45)
        };
        System.out.println("");
        System.out.println(shapes); // print [Llt.techin.karolina.praktikosdiena.oop1.Shape;@6615435c
        System.out.println(Arrays.toString(shapes));
        // print [Rectangle 1: x = 10, y = 10, a = 12, b = 16, Circle 1: x = 50, y = 50r=12, Circle 2: x = 100, y = 100r=45]
        for (Shape shape : shapes) {
            System.out.println(shape);
        } // print
        // Rectangle 1: x = 10, y = 10, a = 12, b = 16
        // Circle 1: x = 50, y = 50r=12
        // Circle 2: x = 100, y = 100r=45

        for (Shape shape : shapes) {
//            Jeigu shape yra rectangle palikuonis -> instranceof
            if (shape instanceof Rectangle) {
                System.out.println("Rectangle area: " + (((Rectangle) shape).countArea())); // print 192.0
            }
            if (shape instanceof Circle) {
                System.out.println("Circle area: " + (((Circle) shape).countArea()));
                // print 452.3893421169302
                // print 6361.725123519332
            }
            if (shape instanceof Triangle) {
                System.out.println("Triangle area: " + (((Triangle) shape).countArea()));
            }
        }
    }
}
