package lt.techin.karolina.praktikosdiena.oop1;

public class Circle extends Shape {
    private int r;

    public Circle(String name, int x, int y, int r) {
        super(name, x, y);
        this.r = r;
    }
//      Kadangi nenaudojame, galime istrinti
//    public int getR() {
//        return r;
//    }
//
//    public void setR(int r) {
//        this.r = r;
//    }

    @Override
    public String toString() {
        return super.toString() + "r=" + r;
    }

    public double countArea() {
        return Math.PI * (r * r);
    }
}
