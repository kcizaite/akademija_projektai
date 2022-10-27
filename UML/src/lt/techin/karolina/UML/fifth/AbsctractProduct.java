package lt.techin.karolina.UML.fifth;

public abstract class AbsctractProduct implements ShoppingCartItem{ // cia del to impl
    private String name;
    private double price;

    public AbsctractProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    //    Abstractu, nes pati klase tokia yra ir juos realizuos metodai:
    //        sita galime padaryti cia
    public double getPriceWithVat(){
        return this.price * this.getVat();
    }
    //    Abstractu, nes pati klase tokia yra ir juos realizuos metodai
    public abstract double getVat();
}
