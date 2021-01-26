public class SavingsAccount extends BankAccount {

    private int withdrawalCounter = 0;
    private final int WITHDRAWAL_LIMIT = 2;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() && withdrawalCounter++ < WITHDRAWAL_LIMIT){
            super.withdraw(amount);
        }
    }

}
