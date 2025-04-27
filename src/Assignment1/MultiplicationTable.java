package Assignment1;
import java.util.Scanner;
public class MultiplicationTable {
	    public static void printTableForLoop(int n) {
	        System.out.println("Multiplication Table using for loop:");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(n + " x " + i + " = " + (n * i));
	        }
	    }
	    public static void printTableWhileLoop(int n) {
	        System.out.println("Multiplication Table using while loop:");
	        int i = 1;
	        while (i <= 10) {
	            System.out.println(n + " x " + i + " = " + (n * i));
	            i++;
	        }
	    }
	    public static void printTableDoWhileLoop(int n) {
	        System.out.println("Multiplication Table using do-while loop:");
	        int i = 1;
	        do {
	            System.out.println(n + " x " + i + " = " + (n * i));
	            i++;
	        } while (i <= 10);
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        printTableForLoop(n);
	        printTableWhileLoop(n);
	        printTableDoWhileLoop(n);
	        scanner.close();
	    }
	}
