package lt.techin.karolina.UML.fifth;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements ShoppingCartItem{
    private final List<ShoppingCartItem> items = new ArrayList<>();

    public void add(ShoppingCartItem item){
        item.add(item);
    }

    public double getTotalPrice(){
        double totalPrice = 0.0;
        for (ShoppingCartItem item:items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public double getPriceWithVat() {
        double getPriceWithVat = 0.0;
        for (ShoppingCartItem item:items) {
            getPriceWithVat += item.getPrice();
        }
        return getPriceWithVat;
    }
}


