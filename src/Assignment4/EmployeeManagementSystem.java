package Assignment4;
import java.util.*;

class Employee {
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

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.salary, e2.salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Set<Employee> employeeSet = new HashSet<>();
        Map<Integer, Employee> employeeMap = new HashMap<>();
        
        Employee e1 = new Employee(101, "Prasanth", 50000);
        Employee e2 = new Employee(102, "Sai", 60000);
        Employee e3 = new Employee(103, "Siri", 55000);
        
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        
        employeeMap.put(e1.id, e1);
        employeeMap.put(e2.id, e2);
        employeeMap.put(e3.id, e3);
        
        System.out.println("Employee List (Sorted by Salary):");
        Collections.sort(employeeList, new SalaryComparator());
        for (Employee e : employeeList) {
            System.out.println(e);
        }
        
        System.out.println("\nEmployee Set:");
        for (Employee e : employeeSet) {
            System.out.println(e);
        }
        
        System.out.println("\nEmployee Map:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
