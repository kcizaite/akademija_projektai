package lt.techin.karolina.praktikosdiena.oop1;

public class Triangle extends Shape {
    private int a;
    private int h;

    public Triangle(String name, int x, int y, int a, int h) {
        super(name, x, y);
        this.a = a;
        this.h = h;
    }
//    Kadangi nenaudojame, galime istrinti
//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public int getH() {
//        return h;
//    }
//
//    public void setH(int h) {
//        this.h = h;
//    }

    @Override
    public String toString() {
        return super.toString() + "a=" + a + ", h=" + h;
    }

    @Override
    public double countArea() {
        return 0.5 * h * a;
    }
}
