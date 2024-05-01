package sort;

import java.util.Arrays;

public class main {

	public static void main(String[] args) 
	{
    	
        int[] nums = {5, 3, 6, 1, 8, 2, 9, 4, 7};
        MergeSort.mergeSort(nums, 0, 8);
        System.out.println("Sorted array: " + Arrays.toString(nums));

		
	}

}
