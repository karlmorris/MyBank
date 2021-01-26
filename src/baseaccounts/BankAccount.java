package baseaccounts;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw (double amount) {
        if (amount > 0)
            this.balance -= amount;
    }

    void setBalance (double balance) {
        this.balance = balance;
    }


}
