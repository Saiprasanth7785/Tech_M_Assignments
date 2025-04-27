package Assignment4;
import java.util.*;
class Student {
    String name;
    int marks;
    
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class StudentExamResultsAnalyzer {
    public static void main(String[] args) {
        HashMap<Integer, Student> studentResults = new HashMap<>();
        TreeMap<Integer, Student> sortedResults = new TreeMap<>();
        
        studentResults.put(101, new Student("Prasanth", 85));
        studentResults.put(102, new Student("Sai", 92));
        studentResults.put(103, new Student("Siri", 78));
        
        sortedResults.putAll(studentResults);
        
        System.out.println("Student Exam Results (Unordered):");
        for (Map.Entry<Integer, Student> entry : studentResults.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
        
        System.out.println("\nStudent Exam Results (Sorted by ID):");
        for (Map.Entry<Integer, Student> entry : sortedResults.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}