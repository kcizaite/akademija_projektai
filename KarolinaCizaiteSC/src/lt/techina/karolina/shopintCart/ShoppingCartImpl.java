package lt.techina.karolina.shopintCart;

import lt.techin.shoppingcart.ShoppingCart;
import lt.techin.shoppingcart.ShoppingItem;
import lt.techin.shoppingcart.test.BaseShoppingCartTest;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class ShoppingCartImpl extends BaseShoppingCartTest implements ShoppingCart {

    List<ShoppingItem> list = new ArrayList<>();

    @Override
    public void addShoppingItem(ShoppingItem shoppingItem) {
        list.add(shoppingItem);
    }

    @Override
    public void removeShoppingItem(ShoppingItem shoppingItem) {
        list.remove(shoppingItem);
    }

    @Override
    public void clearShoppingCart() {
        list.clear();
    }


    @Override
    public Collection<ShoppingItem> getShoppingCartItems() {
        return this.list;
    }

    double price = 0;

    @Override
    public double calculateTotalPrice() {
        for (ShoppingItem shoppingItem : list) {
            price += shoppingItem.getPrice();
        }
        return price;
    }

    @Override
    protected ShoppingCart getLockedShoppingCartWithDiscountAndTaxApplied(ShoppingCart shoppingCart, int i, int i1) {
        return null;
    }

    @Override
    protected ShoppingCart getDiscountAppliedShoppingCart(ShoppingCart shoppingCart, int discountRate) {

        double discount = 0;
        double newPrice = 0;

        for (ShoppingItem shoppingItem : list) {
            discount = (shoppingItem.getPrice() * discountRate) / 100;
            newPrice = shoppingItem.getPrice() - discount;
        }
        System.out.println(list);
        return shoppingCart;

    }

    @Override
    protected ShoppingCart getTaxAppliedShoppingCart(ShoppingCart shoppingCart, int taxRate) {
        double taxes = 0;
        double newPrice = 0;

        for (ShoppingItem shoppingItem : list) {
            taxes = shoppingItem.getPrice() * taxRate;
            newPrice = shoppingItem.getPrice() + taxes;
        }
        return shoppingCart;
    }

    @Override
    protected ShoppingCart getLockedFromModificationShoppingCart(ShoppingCart shoppingCart) {
        return null;
    }
}
