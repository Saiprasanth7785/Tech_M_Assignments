package Assignment2;
import java.util.Scanner;
public class ProductPriceComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        String cheapestProduct = "";
        double minPrice = Double.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter product name: ");
            String productName = scanner.next();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            if (price < minPrice) {
                minPrice = price;
                cheapestProduct = productName;
            }
        }
        System.out.println("The cheapest product is " + cheapestProduct + " with a price of $" + minPrice);
        scanner.close();
    }
}
