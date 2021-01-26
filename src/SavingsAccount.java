import baseaccounts.DepositableBankAccount;

public class SavingsAccount extends DepositableBankAccount implements Interestable {

    private int withdrawalCounter = 0;
    private final int WITHDRAWAL_LIMIT = 2;
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
        interestRate = 0.2;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() && withdrawalCounter++ < WITHDRAWAL_LIMIT){
            super.withdraw(amount);
        }
    }

    @Override
    public void addInterest() {
        deposit(getBalance() * interestRate);
    }
}
