package Assignment3;
class ATM {
    private double balance;
    
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }
            try {
                if (amount <= 0) {
                    throw new IllegalArgumentException("Invalid withdrawal amount");
                }
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}

public class ATMSimulationException {
    public static void main(String[] args) {
        ATM atm = new ATM(5000);
        atm.withdraw(6000);
        atm.withdraw(-100);
        atm.withdraw(1000);
    }
}
