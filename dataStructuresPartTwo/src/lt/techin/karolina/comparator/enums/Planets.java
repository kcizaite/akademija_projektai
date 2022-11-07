package lt.techin.karolina.comparator.enums;

// Enum vietoj Class renkames kuriant
// Enum yra isvardijimas, talpina FINAL tipus
public enum Planets {
    //    NEBEKEICIAMI OBJEKTAI ENUM YRA
    MERCURY(0.06), VENUS(0.81), EARTH(1.00), MARS(0.11); // Cia yra objektai, singletonai => elementai, kurie naudojami, bet nekeiciami niekur

    //    Visada galime sukurti konstruktoriu jiems, bet jiems reikias prideti parametrus => (verte)
    private double mass;

    Planets(double mass) {
        this.mass = mass;
    }

    //    Su konstruktorium, kuri noresiu pasiekti eina auto ir getteris
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
