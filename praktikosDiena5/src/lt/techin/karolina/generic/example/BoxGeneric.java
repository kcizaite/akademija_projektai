package lt.techin.karolina.generic.example;
// GENERICS VARIANTAS: klases pavadinimas <parametras?>
// E - element (kolekcijos elementas)
// T - type
// K - key
// Nebaigiau
public class BoxGeneric<T> {
    private T item;
    public T getItem() {
        return item;
    }
    public void addItem(T item) {
        this.item = item;
    }
    public static void main(String[] args) {
        BoxGeneric<String> box = new BoxGeneric<>();
        box.addItem("bruh");
        String s = box.getItem();
        System.out.println(s.toUpperCase()); // print
        }
    }

