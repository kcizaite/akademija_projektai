package lt.techin.karolina.praktikosdiena.shop;

public class Client {
    public static void main(String[] args) {
        Clothes shirt = new Clothes("Adidas", 25.42);
        Cart cart = new Cart();
        cart.putProductToCart(shirt);
        cart.getAllProductsPrice();
    }
}
