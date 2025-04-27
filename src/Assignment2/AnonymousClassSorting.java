package Assignment2;
import java.util.*;
public class AnonymousClassSorting {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2);
        
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        System.out.println("Sorted Numbers: " + numbers);
    }
}
