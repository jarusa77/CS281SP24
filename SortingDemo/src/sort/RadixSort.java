package sort;
import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] nums = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }

    public static void radixSort(int[] nums) {
        int max = getMax(nums);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(nums, exp);
        }
    }

    public static void countSort(int[] nums, int exp) {
        int[] output = new int[nums.length];
        int[] count = new int[10];

        for (int i = 0; i < nums.length; i++) {
            int digit = (nums[i] / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            int digit = (nums[i] / exp) % 10;
            output[count[digit] - 1] = nums[i];
            count[digit]--;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = output[i];
        }
    }

    public static int getMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
