package lt.techin.karolina.praktikosdiena.oop1;

public class Rectangle extends Shape{
    private int a;
    private int b;

//    public Rectangle(){} -> default gali but, nes tevas tokia turi
//    Paveldejusi klase gali tureti tik metodus, bet ne konstuktoriu atskira
    public Rectangle(String name, int x, int y, int a, int b) {
        super(name, x, y);
        this.a = a;
        this.b = b;
    }
//      Kadangi nenaudojame, galime istrinti
//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }

    @Override
    public String toString() {
        return super.toString() + ", a = " + a + ", b = " + b;
    }

    public double countArea(){
        return a * b;
    }
}
