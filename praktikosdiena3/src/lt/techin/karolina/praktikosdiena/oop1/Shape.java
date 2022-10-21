package lt.techin.karolina.praktikosdiena.oop1;

// Abstract -> neleidzia is jos kurti objektu
public abstract class Shape {
    private String name;
    private int x;
    private int y;

    //    Jeigu tetis tures default constructoriu, tai tik tada galesim vaikams juos kurti
    public Shape() {

    }

    public Shape(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
//      Galime istrinti, nes ju nerealizuojame
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }

    @Override
//    Kaip mums sout ismes
    public String toString() {
        return name + ": x = " + x + ", y = " + y;
    }

    //    Abstractus metodas
    public abstract double countArea();
}
