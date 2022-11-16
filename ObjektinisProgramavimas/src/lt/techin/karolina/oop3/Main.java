package lt.techin.karolina.oop3;
import java.util.Scanner;
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello! Please fill the information bellow (press ENTER)");
        System.out.println("Your point x value: ");
        int x = input.nextInt();
        System.out.println("Your point y value: ");
        int y = input.nextInt();
        Point coordinatePoint = new Point(x, y);
        System.out.println("Your coordinate point is: " + coordinatePoint);
        System.out.println("Fill the information about field coordinates (press ENTER)");
        System.out.println("Your field start point x value: ");
        int fromX = input.nextInt();
        System.out.println("Your field start point y value: ");
        int fromY = input.nextInt();
        System.out.println("Your field end point x value: ");
        int tillX = input.nextInt();
        System.out.println("Your field end point y value: ");
        int tillY = input.nextInt();
        Field coordinateField = new Field(fromX, fromY, tillX, tillY);
        System.out.println("Your field coordinates are: " + coordinateField.countPoint(coordinatePoint));
    }
}
