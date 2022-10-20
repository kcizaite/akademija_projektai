package lt.techin.karolina.objprogramavimas.packagefive;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
    public void sound(){
        System.out.println("Animal make sound ...");
    }
}
