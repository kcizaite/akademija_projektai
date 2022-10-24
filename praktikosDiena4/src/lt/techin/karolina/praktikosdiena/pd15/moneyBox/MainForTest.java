package lt.techin.karolina.praktikosdiena.pd15.moneyBox;

public class MainForTest {
    public static void main(String[] args) {
        MoneyBox myBox = new MoneyBox();
        myBox.addMoney(200);
        System.out.println(myBox.getBalance());
        myBox.removeMoney(20);
        System.out.println(myBox.getBalance());
    }
}
