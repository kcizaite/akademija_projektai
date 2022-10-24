package lt.techin.karolina.praktikosdiena.pd15.moneyBox;

public class MoneyBox {
    private double balance = 0.0;
    private int counter = 0;
    private double totalDepositSum = 0.0;
//  Kai bus kuriama parodys, kad yra tuscia
    {
        if (balance == 0.0){
            System.out.println("My Box is Empty!");
        }
    }

    public void addMoney(double money) {
        if (balance + money <= 1000 && money > 0) {
            this.balance += money;
            this.totalDepositSum += money;
            counter++;
        } else {
            System.out.println("Box is full!");
        }
    }

    public void removeMoney(double money) {
        if (balance < money || money <= 0) {
            System.out.println("...");
        } else {
            balance -= money;
        }
    }

    public double calculateAvgDeposit() {
        if (counter == 0) {
            return 0.0;
        } else {
            return totalDepositSum / counter;
        }
    }

    public double getBalance() {
        if (balance == 0.0){
            System.out.println("Money Box is Empty!");
        }
        return balance;
    }
}