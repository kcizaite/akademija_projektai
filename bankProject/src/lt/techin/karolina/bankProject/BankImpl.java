package lt.techin.karolina.bankProject;

import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.Collection;

public class BankImpl implements Bank {
    @Override
    public int getNumberOfAccounts() {
        return getAllAccounts().size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        return null;
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return null;
    }

    @Override
    public Account openDebitAccount(String s) {
        return null;
    }

    @Override
    public Account openCreditAccount(String s, BigDecimal bigDecimal) {
        return null;
    }

    @Override
    public Account getAccountByHolderName(String s) {
        return null;
    }

    @Override
    public Account getAccountByNumber(String s) {
        return null;
    }

    @Override
    public void closeAccount(Account account) {

    }
}
