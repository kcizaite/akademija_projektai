package lt.techin.karolina.praktikosdiena.pd16;
import java.math.BigDecimal;
import java.util.Scanner;
public class MainForTest {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("___Welcome to the `Bank` banking application___");
        System.out.println("Please enter your name below: ");
        String inputName = input.nextLine();
        AccOwner firstAccountAcc = new AccOwner(inputName);
        IbanNumber firstAccountIbanNumber = new IbanNumber();
        Account firstAccount = new Account(firstAccountAcc, firstAccountIbanNumber);
        System.out.println("Your account information:");
        System.out.println(firstAccount);
        System.out.println("Please write the amount of money you want to add:");
        int inputAddMoney = input.nextInt();
        firstAccount.addMoney(BigDecimal.valueOf(inputAddMoney));
        System.out.println("Current account balance: " + firstAccount.getBalance());
        System.out.println("Please write the amount of money you want to withdraw:");
        int inputWithdraw = input.nextInt();
        firstAccount.removeMoney(BigDecimal.valueOf(inputWithdraw));
        System.out.println("Current account balance: " + firstAccount.getBalance());
        System.out.println("___GoodBye!___");
    }
}
