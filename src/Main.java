import baseaccounts.BankAccount;

public class Main {

    public static void main(String[] args) {
        System.out.println("First National Bank!\n");

        BankAccount account1 = new SavingsAccount("123ABC", 1000);
        Interestable account2 = new SavingsAccount("456ABC", 300);
        Interestable account3 = new CDAccount("789ABC", 1200);
        Interestable account4 = new CDAccount("012ABC", 34000);
/*
        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance());


        account1.withdraw(50);
        System.out.println("Balance: " + account1.getBalance());
        account1.withdraw(50);
        System.out.println("Balance: " + account1.getBalance());
        account1.withdraw(50);
        System.out.println("Balance: " + account1.getBalance());
        //((CheckingAccount) account).writeCheck(1000);
        //System.out.println("Balance: " + account.getBalance());

        ((SavingsAccount) account1).deposit(240);
        System.out.println("Balance: " + account1.getBalance());

         */

        calculateInterest((Interestable) account1, account2, account3, account4);

    }

    public static void calculateInterest (Interestable... accounts){
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Balance for account " + ((BankAccount) accounts[i]).getAccountNumber() + " before interest is " + ((BankAccount) accounts[i]).getBalance() );
            accounts[i].addInterest();
            System.out.println("Balance for account " + ((BankAccount) accounts[i]).getAccountNumber() + " after interest is " + ((BankAccount) accounts[i]).getBalance() );
        }
    }

}
