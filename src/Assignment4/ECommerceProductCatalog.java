package Assignment4;
import java.util.*;

class Product {
    int id;
    String name;
    double price;
    
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: " + price;
    }
}

class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.price, p2.price);
    }
}

public class ECommerceProductCatalog {
    public static void main(String[] args) {
        TreeMap<Integer, Product> productCatalog = new TreeMap<>();
        HashSet<Product> uniqueProducts = new HashSet<>();
        
        Product p1 = new Product(101, "Laptop", 800.0);
        Product p2 = new Product(102, "Phone", 500.0);
        Product p3 = new Product(103, "Tablet", 300.0);
        
        productCatalog.put(p1.id, p1);
        productCatalog.put(p2.id, p2);
        productCatalog.put(p3.id, p3);
        
        uniqueProducts.add(p1);
        uniqueProducts.add(p2);
        uniqueProducts.add(p3);
        
        System.out.println("Product Catalog (Sorted by ID):");
        for (Map.Entry<Integer, Product> entry : productCatalog.entrySet()) {
            System.out.println(entry.getValue());
        }
        
        System.out.println("\nUnique Products:");
        for (Product p : uniqueProducts) {
            System.out.println(p);
        }
        
        List<Product> productList = new ArrayList<>(uniqueProducts);
        productList.sort(new PriceComparator());
        
        System.out.println("\nProducts Sorted by Price:");
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}