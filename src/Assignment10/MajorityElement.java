package Assignment10;

public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int candidate = 0, count = 0;

        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 3, 3, 3};
        System.out.println("Majority Element: " + findMajorityElement(nums));
    }
}
