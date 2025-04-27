package Assignment8;
import java.util.*;
class MemoryLeakSimulator {
    private List<byte[]> memoryLeak = new ArrayList<>();
    
    public void createLeak() {
        for (int i = 0; i < 10000; i++) {
            memoryLeak.add(new byte[1024 * 1024]); // Allocating 1MB blocks
        }
    }
}

public class MemoryLeakDetectorAndFixer {
    public static void main(String[] args) {
        System.out.println("Before Memory Leak: Free Memory = " + Runtime.getRuntime().freeMemory());
        
        MemoryLeakSimulator simulator = new MemoryLeakSimulator();
        simulator.createLeak();
        
        System.out.println("After Memory Leak: Free Memory = " + Runtime.getRuntime().freeMemory());
        
        simulator = null; // Dereferencing the object
        System.gc(); // Requesting Garbage Collection
        
        System.out.println("After Garbage Collection: Free Memory = " + Runtime.getRuntime().freeMemory());
    }
}
