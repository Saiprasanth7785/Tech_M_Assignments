package Assignment10;

import java.util.Arrays;

public class BinarySort {
    public static void sortBinaryArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] == 0) left++;
            while (left < right && arr[right] == 1) right--;
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};
        sortBinaryArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
