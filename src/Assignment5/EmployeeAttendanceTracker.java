package Assignment5;
import java.time.*;
import java.util.*;
class Employee {
    int id;
    String name;
    LocalDate attendanceDate;
    
    public Employee(int id, String name, LocalDate attendanceDate) {
        this.id = id;
        this.name = name;
        this.attendanceDate = attendanceDate;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Date: " + attendanceDate;
    }
}

public class EmployeeAttendanceTracker {
    public static void main(String[] args) {
        List<Employee> attendanceList = Arrays.asList(
            new Employee(101, "Prasanth", LocalDate.of(2024, 4, 1)),
            new Employee(102, "Sai", LocalDate.of(2024, 4, 2)),
            new Employee(103, "Siri", LocalDate.of(2024, 4, 1))
        );
        
        System.out.println("All Attendance Records:");
        attendanceList.forEach(System.out::println);
        
        Optional<Employee> latestAttendance = attendanceList.stream()
            .max(Comparator.comparing(e -> e.attendanceDate));
        
        System.out.println("\nLatest Attendance Record:");
        latestAttendance.ifPresent(System.out::println);
    }
}