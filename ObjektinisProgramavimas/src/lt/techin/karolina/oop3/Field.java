package lt.techin.karolina.oop3;

public class Field {
    private int fromX;
    private int fromY;
    private int tillX;
    private int tillY;

    public Field(int fromX, int fromY, int tillX, int tillY) {
        this.fromX = fromX;
        this.fromY = fromY;
        this.tillX = tillX;
        this.tillY = tillY;
    }

    @Override
    public String toString() {
        return "field start x=" + fromX +
                ", field start y=" + fromY +
                ", field end x=" + tillX +
                ", field end y=" + tillY +
                '}';
    }

    public boolean countPoint(Point coordinatePoint) {
        System.out.println(coordinatePoint.getX() + " <= " + fromX);
        System.out.println(coordinatePoint.getX() <= fromX);
        System.out.println(coordinatePoint.getX() + " >= " + tillX);
        System.out.println(coordinatePoint.getX() >= tillX);
        System.out.println(coordinatePoint.getY() + " <= " + fromY);
        System.out.println(coordinatePoint.getY() <= fromY);
        System.out.println(coordinatePoint.getY() + " >= " + tillY);
        System.out.println(coordinatePoint.getY() >= tillY);
        if (coordinatePoint.getX() >= fromX && coordinatePoint.getX() <= tillX &&
                coordinatePoint.getY() >= fromY && coordinatePoint.getY() <= tillY) {

            return true;
        }
        return false;

    }
}
