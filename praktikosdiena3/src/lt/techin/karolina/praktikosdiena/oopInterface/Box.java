package lt.techin.karolina.praktikosdiena.oopInterface;
// Interface = Comparable -> kaip isspresti paveldejimo problema, kai ateityje nezinosime kad mums + reikejo dar kazko
public class Box implements Comparable<Box>{
    private int x;
    private int y;
    private int z;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    public int countVolume(){
        return x * y * z;
    }

    @Override // uztikrina, kad metodo signatura butu tokia kaip pas teva, o realizacija gali buti skirtinga
    public int compareTo(Box box) { // vietoj o => box
        return countVolume() - box.countVolume(); // vietoj 0 => countVolume() - box.countVolume()
    }
}
