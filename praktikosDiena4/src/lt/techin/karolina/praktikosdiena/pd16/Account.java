package lt.techin.karolina.praktikosdiena.pd16;

import java.math.BigDecimal;

public class Account {
    private final String IBAN_NUMBER = ""; // vietoj "" turetu buti klase, kuri generuoja saskaitas
    private final String ACC_OWNER = "";
    private BigDecimal balance = new BigDecimal(0.0);

    public String getIBAN_NUMBER() {
        return IBAN_NUMBER;
    }

    public String getACC_OWNER() {
        return ACC_OWNER;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
