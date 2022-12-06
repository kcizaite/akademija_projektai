package lt.techina.karolina.shopintCart;

import lt.techin.shoppingcart.ShoppingCart;
import lt.techin.shoppingcart.ShoppingItem;

import java.util.Collection;

public class Shop implements ShoppingCart {
    @Override
    public void addShoppingItem(ShoppingItem shoppingItem) {

    }

    @Override
    public void removeShoppingItem(ShoppingItem shoppingItem) {

    }

    @Override
    public void clearShoppingCart() {

    }

    @Override
    public Collection<ShoppingItem> getShoppingCartItems() {
        return null;
    }

    @Override
    public double calculateTotalPrice() {
        return 0;
    }
}
