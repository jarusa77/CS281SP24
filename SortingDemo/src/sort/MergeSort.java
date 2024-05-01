package sort;

public class MergeSort {


    public static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(nums, left, middle);
            mergeSort(nums, middle + 1, right);
            merge(nums, left, middle, right);
        }
    }

    public static void merge(int[] nums, int left, int middle, int right) {
        int[] temp = new int[nums.length];
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }

        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right) {
            if (temp[i] <= temp[j]) {
                nums[k] = temp[i];
                i++;
            } else {
                nums[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            nums[k] = temp[i];
            k++;
            i++;
        }
    }
}
