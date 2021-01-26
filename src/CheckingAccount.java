import baseaccounts.BankAccount;
import baseaccounts.DepositableBankAccount;

public class CheckingAccount extends DepositableBankAccount {

    private final double OVERDRAFT_LIMIT = 200;
    private final double OVERDRAFT_FEE = 30;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()){
            super.withdraw(amount);
        }
    }

    public void writeCheck(double amount) {
        if (amount <= getBalance())
            withdraw(amount);
        else if (amount <= getBalance() + OVERDRAFT_LIMIT) {
            withdraw(amount);
            withdraw(OVERDRAFT_FEE);
        }

    }
}
