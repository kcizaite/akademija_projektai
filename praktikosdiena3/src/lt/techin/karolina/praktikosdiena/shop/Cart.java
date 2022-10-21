package lt.techin.karolina.praktikosdiena.shop;

public class Cart {
    private Product[] products = new Product[100];
    private static int productCounter = 0;
//    TODO put and get all price

    public void putProductToCart(Product product){
        products[productCounter] = product;
        productCounter++;
    }

    public void getAllProductsPrice(){
        double sum = 0;
        for (Product product:products) {
            sum = sum + product.getPrice();
        }
        System.out.println("Your price is: " + sum);
    }
}
