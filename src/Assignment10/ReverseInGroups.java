package Assignment10;

import java.util.Arrays;

public class ReverseInGroups {
    public static void reverseGroups(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i += k) {
            int left = i, right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;
        reverseGroups(arr, k);
        System.out.println("Reversed in Groups: " + Arrays.toString(arr));
    }
}

