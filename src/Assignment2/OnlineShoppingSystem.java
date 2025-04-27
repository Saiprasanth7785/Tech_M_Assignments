package Assignment2;
import java.util.ArrayList;
import java.util.List;
abstract class Product {
    protected String name;
    protected double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract void displayProductDetails();
}
class Electronics extends Product {
    private String brand;
    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }
    @Override
    public void displayProductDetails() {
        System.out.println("Electronics: " + name + ", Brand: " + brand + ", Price: $" + price);
    }
}
class Clothing extends Product {
    private String size;
    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }
    @Override
    public void displayProductDetails() {
        System.out.println("Clothing: " + name + ", Size: " + size + ", Price: $" + price);
    }
}
class ShoppingCart {
    private List<Product> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }
    public void addProduct(Product product) {
        cart.add(product);
        System.out.println("Added to cart: " + product.name);
    }
    public void showCart() {
        System.out.println("\nShopping Cart:");
        for (Product product : cart) {
            product.displayProductDetails();
        }
    }
}
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product laptop = new Electronics("Laptop", 1200.0, "Dell");
        Product tshirt = new Clothing("T-Shirt", 25.0, "M");
        cart.addProduct(laptop);
        cart.addProduct(tshirt);
        cart.showCart();
    }
}