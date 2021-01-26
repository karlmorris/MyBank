public class CheckingAccount extends BankAccount {

    private final double OVERDRAFT_LIMIT = 200;
    private final double OVERDRAFT_FEE = 30;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
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
