package my.code;

public class FindPivotIndex {

	public static void main(String[] args) {
		int[] nums = {1, 7, 3, 6, 5, 6};
		System.out.println(pivotIndex(nums));
	}
	
    public static int pivotIndex(int[] nums) {
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
