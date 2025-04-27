package Assignment7;
import java.util.*;

class OrderProcessor {
    private final Queue<String> orders = new LinkedList<>();
    
    public synchronized void placeOrder(String order) {
        orders.add(order);
        System.out.println("Order Placed: " + order);
        notify();
    }
    
    public synchronized void processOrder() {
        while (orders.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Processing Order: " + orders.poll());
    }
}

public class MultiThreadedOrderProcessingSystem {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                processor.placeOrder("Order" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                processor.processOrder();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        
        producer.start();
        consumer.start();
    }
}
