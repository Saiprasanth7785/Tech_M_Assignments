package Assignment1;

public class TypePromotionDemo {
	public static void main(String[] args) {
        int a = 10;
        float b = 5.5f;
        double c = 20.5;
        char d = 'A';
        double result1 = a + b;
        double result2 = a + c;
        int result3 = d + a;
        double result4 = b + c;
        System.out.println("Result of int + float: " + result1);
        System.out.println("Result of int + double: " + result2);
        System.out.println("Result of char + int: " + result3);
        System.out.println("Result of float + double: " + result4);
    }
}
