package lt.techin.karolina.objprogramavimas.packagefive;

public class Birds extends Animal {
    private boolean isFly;

    public Birds(String name, boolean isFly) {
        super(name);
        this.isFly = isFly;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "isFly=" + isFly +
                '}';
    }

    @Override
    public void sound(){
        System.out.println("Bird sing ...");
    }
}
