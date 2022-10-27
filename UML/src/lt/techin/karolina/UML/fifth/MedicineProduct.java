package lt.techin.karolina.UML.fifth;
// Negalime implementuoti, todel tvarakome
public class MedicineProduct extends AbsctractProduct{

    private final double MEDICINE_VAT = 1.05; // Kazkodel 5 proc taip uzrasem :)

    public MedicineProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getVat() {
        return MEDICINE_VAT;
    }


    @Override
    public void add(ShoppingCartItem item) {

    }
}
