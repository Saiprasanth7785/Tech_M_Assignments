package Assignment4;
import java.util.*;
class Course {
    String courseCode;
    String courseName;
    
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    
    @Override
    public String toString() {
        return "Course Code: " + courseCode + ", Course Name: " + courseName;
    }
}

public class UniversityCourseEnrollment {
    public static void main(String[] args) {
        LinkedList<Course> courseList = new LinkedList<>();
        
        courseList.add(new Course("CS101", "Data Structures"));
        courseList.add(new Course("CS102", "Algorithms"));
        courseList.add(new Course("CS103", "Java Programming"));
        
        System.out.println("Courses using Iterator:");
        Iterator<Course> iterator = courseList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("\nCourses using ListIterator (Forward):");
        ListIterator<Course> listIterator = courseList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        
        System.out.println("\nCourses using ListIterator (Backward):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
