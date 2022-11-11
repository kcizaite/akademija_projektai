package lt.techin.karolina.generic.example;

public class Box {
    private Object item; // Object -> bet koks tipas, cia tam, kad nesirinkti String, poto keist i int ir t.t.
    public Object getItem() {
        return item;
    }
    public void addItem(Object item) {
        this.item = item;
    }
    public static void main(String[] args) {
        Box box = new Box();
        box.addItem("bruh"); // print BRUH
//        box.addItem(20); // print  class java.lang.Integer cannot be cast to class java.lang.String
        if (box.getItem() instanceof String) { // IF leis mums isvengt klaidos su int (ignoruos)
            String s = (String) box.getItem(); // Cia mes raudona bruksni, reikia castint (auto leidzia pasirinkti)
            System.out.println(s.toUpperCase()); // print
        }
    }
}
