package Assignment10;
import java.util.Arrays;
public class BinaryArraySorter {
    public static void sortBinaryArray(int[] arr) {
        int countZeros = 0;
        
        for (int num : arr) {
            if (num == 0) countZeros++;
        }

        for (int i = 0; i < countZeros; i++) arr[i] = 0;
        for (int i = countZeros; i < arr.length; i++) arr[i] = 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};
        sortBinaryArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

