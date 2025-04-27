package Assignment10;

public class MaxElement {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 6, 42, 18};
        System.out.println("Maximum Element: " + findMax(arr));
    }
}
