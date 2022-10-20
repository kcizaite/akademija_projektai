package lt.techin.karolina.objprogramavimas.packagefive;

public class Dogs extends Animal{
    private int legsNumber;

    public Dogs(String name, int legsNumber) {
        super(name);
        this.legsNumber = legsNumber;
    }

    public int getLegsNumber() {
        return legsNumber;
    }

    public void setLegsNumber(int legsNumber) {
        this.legsNumber = legsNumber;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "legsNumber=" + legsNumber +
                '}';
    }

    @Override
    public void sound(){
        System.out.println("Dog barking ...");
    }
}
