package Assignment1;
import java.util.Scanner;
public class DiscounntCalculator {
	public static double calculateDiscount(double amount) {
        if (amount >= 500) {
            return amount * 0.20;
        } else if (amount >= 200) {
            return amount * 0.10;
        } else if (amount >= 100) {
            return amount * 0.05;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total purchase amount: ");
        double amount = scanner.nextDouble();
        double discount = calculateDiscount(amount);
        double finalAmount = amount - discount;
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Final Amount to Pay: $" + finalAmount);
        scanner.close();
    }
}
