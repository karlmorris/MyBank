import baseaccounts.BankAccount;

public class CDAccount extends BankAccount implements Interestable {

    public CDAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void addInterest() {

    }
}
