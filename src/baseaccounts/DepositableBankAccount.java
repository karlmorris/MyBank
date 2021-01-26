package baseaccounts;

import baseaccounts.BankAccount;

public abstract class DepositableBankAccount extends BankAccount {
    public DepositableBankAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void deposit(double amount) {
        if (amount > 0)
            super.setBalance(getBalance() + amount);
    }
}
