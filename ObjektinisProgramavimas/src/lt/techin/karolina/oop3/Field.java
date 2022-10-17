package lt.techin.karolina.oop3;
// Jeigu lauke taskas netalpinamas, mes tai pasakome
public class Field {
    private int x;
    private int y;
    private double size;

    public Field() {
        this(0, 0);
    }
    public Field(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        countFieldSize();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        countFieldSize();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Field point (");
        sb.append(this.x);
        sb.append(", ");
        sb.append(this.y);
        sb.append(")");
        return sb.toString();
    }

    public double countFieldSize() { // private
        size = (x * y);
        return size;
    }

    public double getSize() {
        return size;
    }


}
