package lt.techin.karolina.oop2;

// Apraso taska plokstumoje
public class Point {
    private int x; // 0
    private int y;
    private double lenght;
    private static int pointCounter; // visiems objektams bus vienas parametras sitas, statinis
    private final int pointNumber; // Final neleidzia keisti metodo/lauko -> negalesime modifikuoti, bus koks yra

    public Point() {
        this(0, 0); // konstruktoriu perdengimas, default values
    }

    //    ALT INSERT Constructor - abu vel pasirinkti
    public Point(int x, int y) { // KONSTRUKTORIUS
//        this.x = x;
//        this.y = y;
//        Kad nebutu kodo pasikartojimo
        setX(x);
        setY(y);
        pointNumber = pointCounter++;
    }

    //    ALT INSERT Getter and Setter + x ir y apibreziam kartu, kad tureti
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        countLenght();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        countLenght();
    }

    // ALT INSERT toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.x); // this reiskia rask man sito obj nuoroda, pagal ja metoda/klases lauka ir grazink ko praso vartotojas
        sb.append(", ");
        sb.append(this.y);
        sb.append(")");
        return sb.toString(); // StringBuilderi naudojame, kad nereiktu + naudot
    }

    private void countLenght() {
        lenght = Math.sqrt(x * x + y * y);
    }

    public double getLength() {
        return lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public int getPointNumber() {
        return pointNumber;
    }

    public static int getPointCounter() {
        return pointCounter;
    }

    public double distanceTo(Point point) {
        return Math.sqrt((this.x - point.x)*(this.x - point.x) + (this.y - point.y)*(this.y - point.y));
    }


}
