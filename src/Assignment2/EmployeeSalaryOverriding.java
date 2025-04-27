package Assignment2;
class Employee {
    protected String name;
    protected double baseSalary;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double calculateSalary() {
        return baseSalary;
    }
    public void displaySalary() {
        System.out.println("Employee: " + name + ", Salary: $" + calculateSalary());
    }
}
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
class Developer extends Employee {
    private double projectAllowance;

    public Developer(String name, double baseSalary, double projectAllowance) {
        super(name, baseSalary);
        this.projectAllowance = projectAllowance;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + projectAllowance;
    }
}
public class EmployeeSalaryOverriding {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Alice", 5000, 2000);
        Employee emp2 = new Developer("Bob", 4000, 1000);
        emp1.displaySalary();
        emp2.displaySalary();
    }
}
