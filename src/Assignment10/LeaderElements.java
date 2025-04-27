package Assignment10;

import java.util.ArrayList;
import java.util.List;

public class LeaderElements {
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int maxRight = arr[arr.length - 1];
        leaders.add(maxRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                leaders.add(maxRight);
            }
        }
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println("Leader Elements: " + findLeaders(arr));
    }
}

