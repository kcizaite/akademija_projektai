package lt.techin.praktika1;

import java.math.BigDecimal;

public class JavaBigDecimal {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(5); // 5 yra objektas
        System.out.println(bigDecimal.compareTo(new BigDecimal(0))); // print 1
        System.out.println(bigDecimal.compareTo(new BigDecimal(5))); // print 0
        System.out.println(bigDecimal.compareTo(new BigDecimal(10))); // print -1

        float accountBalance = 10000.00f;
        System.out.println("operation using float: ");
        System.out.println("1000 operations for 1.99 ");
        for (int i = 0; i < 1000; i++) {
            accountBalance -= 1.99;
        }
        System.out.println(String.format("Account balance after float operations: %f", accountBalance));
//        print Account balance after float operations: 8009.765625

        BigDecimal accountBalanceTwo = new BigDecimal("10000.00");
        System.out.println("operation using BigDecimal: ");
        System.out.println("1000 operations for 1.99 ");
        BigDecimal price = new BigDecimal("1.99");
        for (int i = 0; i < 1000; i++) {
            accountBalanceTwo = accountBalanceTwo.subtract(price);
        }

        System.out.println(String.format("Account balance after float operations: %f", accountBalanceTwo));
//        print Account balance after float operations: 8010.000000
    }
}
