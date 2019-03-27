package my.code;

/**
 * Given an array of integers nums, write a method that returns the "pivot" 
 * index of this array.
 * 
 * We define the pivot index as the index where the sum of the numbers to the 
 * left of the index is equal to the sum of the numbers to the right of the 
 * index.
 *
 * If no such index exists, we should return -1. If there are multiple pivot 
 * indexes, you should return the left-most pivot index.
 *
 * @author rmemory
 *
 */

public class FindPivotIndex {
    public static int solution(int[] nums) {
        int total = 0, sum = 0;
        
        // calculate the sum total of the entire array
        for (int num : nums) {
        	total += num;	
        }
        
        // sum is the running total so far (or in other words,
        // the left sum. See description below)
        for (int i = 0; i < nums.length; sum += nums[i++])
        	/*
        	 * When nums[i] finds the actual pivot ...
        	 * 
        	 * (total - value at pivot index) == 
        	 * 		sum(numbers to left of pivot) 
        	 *    + sum(numbers to right of pivot)
        	 * 
        	 * Stated differently, the sum to the left 
        	 * of the pivot is equal to the right of the
        	 * pivot. And thus, once the pivot value itself
        	 * is subtracted off the total, what remains 
        	 * will equal the left sum and right sum.
        	 * 
        	 * Furthermore, because the left sum and right
        	 * sum are equal, this implies "sum * 2" is 
        	 * identical to the left_sum + right sum. 
        	 * 
        	 * And, nums[i] is just the pivot value. 
        	 * 
        	 */
            if (sum * 2 == total - nums[i]) return i;
        return -1;  
    }

}
