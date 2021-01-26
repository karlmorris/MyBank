public class Main {

    public static void main(String[] args) {
        System.out.println("First National Bank!\n");

        BankAccount account = new SavingsAccount("123ABC", 1000);

        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(50);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(50);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(50);
        System.out.println("Balance: " + account.getBalance());
        //((CheckingAccount) account).writeCheck(1000);
        //System.out.println("Balance: " + account.getBalance());

    }
}
