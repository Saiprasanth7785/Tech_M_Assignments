package Assignment6;
import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    double salary;
    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

class EmployeeDatabase {
    private static final String FILE_NAME = "employees.dat";
    
    public static void saveEmployees(List<Employee> employees) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
        }
    }
    
    @SuppressWarnings("unchecked")
	public static List<Employee> loadEmployees() throws IOException, ClassNotFoundException {
        File file = new File(FILE_NAME);
        if (!file.exists()) return new ArrayList<>();
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Employee>) ois.readObject();
        }
    }
}

public class EmployeeDatabaseManagement {
    public static void main(String[] args) throws Exception {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Prasanth", 50000),
            new Employee(102, "Sai", 60000),
            new Employee(103, "Siri", 55000)
        );
        
        EmployeeDatabase.saveEmployees(employees);
        System.out.println("Employees saved successfully.");
        
        List<Employee> loadedEmployees = EmployeeDatabase.loadEmployees();
        System.out.println("\nLoaded Employees:");
        loadedEmployees.forEach(System.out::println);
    }
}
