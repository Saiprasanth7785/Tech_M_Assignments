package Assignment4;

import java.util.*;

class Ticket {
    int id;
    String passengerName;
    int priority;
    
    public Ticket(int id, String passengerName, int priority) {
        this.id = id;
        this.passengerName = passengerName;
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        return "Ticket ID: " + id + ", Passenger: " + passengerName + ", Priority: " + priority;
    }
}

class TicketComparator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket t1, Ticket t2) {
        return Integer.compare(t2.priority, t1.priority);
    }
}

public class FlightTicketBookingSystem {
    public static void main(String[] args) {
        Queue<Ticket> ticketQueue = new LinkedList<>();
        PriorityQueue<Ticket> priorityQueue = new PriorityQueue<>(new TicketComparator());
        
        Ticket t1 = new Ticket(101, "Prasanth", 2);
        Ticket t2 = new Ticket(102, "Sai", 3);
        Ticket t3 = new Ticket(103, "Siri", 1);
        
        ticketQueue.add(t1);
        ticketQueue.add(t2);
        ticketQueue.add(t3);
        
        priorityQueue.add(t1);
        priorityQueue.add(t2);
        priorityQueue.add(t3);
        
        System.out.println("Processing tickets in normal queue order:");
        while (!ticketQueue.isEmpty()) {
            System.out.println(ticketQueue.poll());
        }
        
        System.out.println("\nProcessing tickets in priority order:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
