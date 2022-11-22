package lt.techin.karolina.bankProject;

import ibank.Bank;
import ibank.BaseBankTest;

public class BankTest extends BaseBankTest {
    @Override
    protected Bank createBank() {
        return new BankImpl();
    }
}
