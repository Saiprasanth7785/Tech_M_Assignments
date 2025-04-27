package Assignment2;
class BankAccount {
    protected String accountHolder;
    protected String accountNumber;
    protected double balance;
    public BankAccount() {
        this("Unknown", "000000", 0.0);
    }
    public BankAccount(String accountHolder, String accountNumber) {
        this(accountHolder, accountNumber, 0.0);
    }
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount defaultAccount = new BankAccount();
        BankAccount basicAccount = new BankAccount("Alice", "123456");
        BankAccount fullAccount = new BankAccount("Bob", "789012", 5000.0);
        System.out.println("Default Account:");
        defaultAccount.displayAccountInfo();
        System.out.println("\nBasic Account:");
        basicAccount.displayAccountInfo();
        System.out.println("\nFull Account:");
        fullAccount.displayAccountInfo();
    }
}
