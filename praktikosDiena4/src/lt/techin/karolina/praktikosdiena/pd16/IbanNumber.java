package lt.techin.karolina.praktikosdiena.pd16;

import java.util.Random;
//  Creating a new account number
public class IbanNumber {
    Random rnd = new Random();
    private final String lt = "LT";
    private int controlNumbers = rnd.nextInt(99);
    private final int bankCode = 35000;
    private int lastNumbers = rnd.nextInt(999999999);

    public String createNewAccNumber() {
        StringBuilder newAccNumber = new StringBuilder();
        newAccNumber.append(lt).append(" ").append(controlNumbers).append(" ")
                .append(bankCode).append(" ").append(lastNumbers);
        return newAccNumber.toString();
    }
}
