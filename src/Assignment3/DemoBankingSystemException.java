package Assignment3;
import java.util.HashMap;

class InsufficientFundsException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountNotFoundException(String message) {
        super(message);
    }
}

class Bank {
    private HashMap<Integer, Double> accounts = new HashMap<>();
    
    public void createAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }
    
    public double getBalance(int accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            throw new AccountNotFoundException("Account not found");
        }
        return accounts.get(accountNumber);
    }
    
    public void withdraw(int accountNumber, double amount) throws InsufficientFundsException {
        if (!accounts.containsKey(accountNumber)) {
            throw new AccountNotFoundException("Account not found");
        }
        double balance = accounts.get(accountNumber);
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        accounts.put(accountNumber, balance - amount);
    }
    
    public void deposit(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            throw new AccountNotFoundException("Account not found");
        }
        accounts.put(accountNumber, accounts.get(accountNumber) + amount);
    }
}

public class DemoBankingSystemException {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount(1001, 5000);
        bank.createAccount(1002, 3000);
        
        try {
            bank.withdraw(1001, 6000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            bank.getBalance(1003);
        } catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}