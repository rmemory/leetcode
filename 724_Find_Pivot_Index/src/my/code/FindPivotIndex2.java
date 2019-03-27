package my.code;

public class FindPivotIndex2 {

	public static int solution(int[] nums) {
		int total = 0;
		
		for (int num: nums) {
			total += num;
		}
		
		int leftSum = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((total - nums[i]) == leftSum * 2) {
				return i;
			} else {
				leftSum += nums[i];
			}
		}
		
		return -1;
	}

}
