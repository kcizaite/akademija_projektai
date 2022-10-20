package lt.techin.karolina.objprogramavimas.packagefour;

public class ClassA {
    private String name = "Java";

    public ClassA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override // Kas paskutinis, tas ir rezisierius
    public String toString() {
        return "ClassA{" +
                "name='" + name + '\'' +
                '}';
    }
}
