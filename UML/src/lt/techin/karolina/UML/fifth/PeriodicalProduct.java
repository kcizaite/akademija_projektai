package lt.techin.karolina.UML.fifth;

public class PeriodicalProduct extends AbsctractProduct{

    private final double PERIODICAL_PRODUCT = 1.05; // 5 proc

    public PeriodicalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getVat() {
        return PERIODICAL_PRODUCT;
    }


    @Override
    public void add(ShoppingCartItem item) {

    }
}
