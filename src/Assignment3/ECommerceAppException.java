package Assignment3;

import java.util.*;

class ProductNotFoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(String message) {
        super(message);
    }
}

class PaymentFailedException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PaymentFailedException(String message) {
        super(message);
    }
}

class ECommerceSystem {
    private Map<String, Double> products = new HashMap<>();
    
    public void addProduct(String productName, double price) {
        products.put(productName, price);
    }
    
    public double purchaseProduct(String productName, double payment) throws ProductNotFoundException, PaymentFailedException {
        if (!products.containsKey(productName)) {
            throw new ProductNotFoundException("Product not found");
        }
        double price = products.get(productName);
        if (payment < price) {
            throw new PaymentFailedException("Insufficient payment");
        }
        return payment - price;
    }
}

public class ECommerceAppException {
    public static void main(String[] args) {
        ECommerceSystem system = new ECommerceSystem();
        system.addProduct("Laptop", 800);
        system.addProduct("Phone", 500);
        
        try {
            double change = system.purchaseProduct("Laptop", 700);
            System.out.println("Purchase successful. Change: " + change);
        } catch (ProductNotFoundException | PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
