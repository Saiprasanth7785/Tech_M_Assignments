package Assignment1;

import java.util.Scanner;

public class ATMWithdrawl {
	private double balance;
    public ATMWithdrawl(double initialBalance) {
        this.balance = initialBalance;
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount % 10 != 0) {
            System.out.println("Amount should be in multiples of 10.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMWithdrawl atm = new ATMWithdrawl(1000);
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        atm.withdraw(amount);
        scanner.close();
    }
}
