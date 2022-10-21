package lt.techin.karolina.praktikosdiena.pcExample;

public class Storage {
    private int capacity;
    private String discType;

    public Storage(int capacity, String discType) {
        this.capacity = capacity;
        this.discType = discType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "capacity=" + capacity +
                ", discType='" + discType + '\'' +
                '}';
    }
}
