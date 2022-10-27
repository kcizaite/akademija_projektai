package lt.techin.karolina.UML.fifth;

public interface ShoppingCartItem {
    double getPrice();
    double getPriceWithVat();

    void add(ShoppingCartItem item);
}
