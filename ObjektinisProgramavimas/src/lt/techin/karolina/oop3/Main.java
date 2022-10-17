package lt.techin.karolina.oop3;

public class Main {
    public static void main(String[] args) {
        Field fieldStart = new Field();
        System.out.println(fieldStart);
        Field fieldFinish = new Field(10, 10);
        System.out.println(fieldFinish);
        System.out.println(fieldFinish.countFieldSize());
    }

}
