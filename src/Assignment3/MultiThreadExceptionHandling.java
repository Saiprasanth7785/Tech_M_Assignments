package Assignment3;
class Task implements Runnable {
    private String taskName;
    
    public Task(String taskName) {
        this.taskName = taskName;
    }
    
    @Override
    public void run() {
        try {
            if (taskName.equals("ErrorTask")) {
                throw new RuntimeException("Intentional Exception in " + taskName);
            }
            System.out.println(taskName + " is running");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(taskName + " interrupted");
        } catch (Exception e) {
            System.out.println("Exception in " + taskName + ": " + e.getMessage());
        }
    }
}

public class MultiThreadExceptionHandling {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task("Task1"));
        Thread t2 = new Thread(new Task("ErrorTask"));
        Thread t3 = new Thread(new Task("Task2"));
        
        t1.start();
        t2.start();
        t3.start();
    }
}
