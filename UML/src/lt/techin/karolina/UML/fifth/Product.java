package lt.techin.karolina.UML.fifth;

public class Product extends AbsctractProduct{

    private final double PRODUCT = 1.21; // 21 proc

    public Product(String name, double price) {
        super(name, price);
    }

    @Override
    public double getVat() {
        return PRODUCT;
    }


    @Override
    public void add(ShoppingCartItem item) {

    }
}
