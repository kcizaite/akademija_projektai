package lt.techin.karolina.praktikosdiena.pcExample;

public class Laptop extends Computer{

    private double weight;

    public Laptop(Processor cpu, Memory ram, Storage hhd, double weight) {
        super(cpu, ram, hhd);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
