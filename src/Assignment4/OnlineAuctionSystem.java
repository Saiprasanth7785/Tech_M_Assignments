package Assignment4;
import java.util.*;

class Bid<T> {
    T bidder;
    double amount;
    
    public Bid(T bidder, double amount) {
        this.bidder = bidder;
        this.amount = amount;
    }
    
    @Override
    public String toString() {
        return "Bidder: " + bidder + ", Amount: " + amount;
    }
}

class BidComparator<T> implements Comparator<Bid<T>> {
    @Override
    public int compare(Bid<T> b1, Bid<T> b2) {
        return Double.compare(b2.amount, b1.amount);
    }
}

public class OnlineAuctionSystem {
    public static void main(String[] args) {
        PriorityQueue<Bid<String>> bidQueue = new PriorityQueue<>(new BidComparator<>());
        
        bidQueue.add(new Bid<>("rasanth", 500.0));
        bidQueue.add(new Bid<>("Sai", 700.0));
        bidQueue.add(new Bid<>("Siri", 600.0));
        
        System.out.println("Bids sorted in descending order:");
        while (!bidQueue.isEmpty()) {
            System.out.println(bidQueue.poll());
        }
    }
}