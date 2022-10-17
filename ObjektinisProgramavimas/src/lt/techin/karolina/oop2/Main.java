package lt.techin.karolina.oop2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Point.getPointCounter());
        Point p1 = new Point();
        System.out.println(p1); // print (0, 0)
        p1.setX(10);
        p1.setY(20);
        System.out.println(p1);
        System.out.println(p1.getLength());
        Point p2 = new Point(10, 20);
        System.out.println(p2.getLength());
        System.out.println();
        System.out.println(Point.getPointCounter());
        System.out.println(p1.distanceTo(p2)); // Count p1 distance to p2
        Point p3 = new Point(48, 12);
        System.out.println(p2.distanceTo(p3)); // Count p1 distance to p2
    }
}
