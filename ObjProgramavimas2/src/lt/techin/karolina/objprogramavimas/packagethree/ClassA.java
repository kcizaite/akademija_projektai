package lt.techin.karolina.objprogramavimas.packagethree;

public class ClassA {
    private String name;

    // ALT INSERT CONSTRUCTOR
    public ClassA(String name) {
        this.name = name;
    }

    // ALT INSERT GET/SET
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ALT INSERT toString()
    @Override
    public String toString() {
        return "ClassA{" +
                "name='" + name + '\'' +
                '}';
    }
}
