package lt.techin.karolina.praktikosdiena.pd16;

import java.math.BigDecimal;

public class Account {
    private final String IBAN_NUMBER;
    private final String ACC_OWNER;
    private BigDecimal balance = new BigDecimal(0.0);

    public Account(AccOwner acc_owner, IbanNumber ibanNumber) {
        ACC_OWNER = acc_owner.getCustomerName();
        IBAN_NUMBER = ibanNumber.createNewAccNumber();
    }

    public Account() {
        ACC_OWNER = "";
        IBAN_NUMBER = "";
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void addMoney(BigDecimal money) {
        this.balance = this.balance.add(new BigDecimal(String.valueOf(money)));
        System.out.println("The transaction is successful!");
    }

    public void removeMoney(BigDecimal money) {
        if (money.compareTo(this.balance) <= 0) {
            this.balance = this.balance.subtract(new BigDecimal(String.valueOf(money)));
            System.out.println("The transaction is successful!");
        } else {
            System.out.println("Insufficient funds. Try again!");
        }
    }

    @Override
    public String toString() {
        return "Account Information: " + "\n" +
                "Account Number(IBAN NUMBER) = " + IBAN_NUMBER + "\n" +
                "Account Owner Name = " + ACC_OWNER + "\n" +
                "Account Balance = " + balance;
    }
}

