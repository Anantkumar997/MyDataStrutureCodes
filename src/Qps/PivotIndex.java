package Qps;

public class PivotIndex {

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,6};
		System.out.println(pivotIndex2(arr));

	}
	public static int pivotIndex(int[] nums) {
		int[] left = new int[nums.length];
		left[0] = nums[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i - 1] + nums[i] ;
		}
		
		int[] right = new int[nums.length];
		right[right.length - 1] = nums[nums.length - 1];
		for (int i = nums.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] + nums[i] ;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (left[i] == right[i]) {
				return i ;
			}
		}
		return -1;
		
	}
	public static int pivotIndex2(int[] nums) {
		int leftsum = 0 ;
		int rightSum = 0 ;
		for(int i = 1 ; i < nums.length ; i++) {
			rightSum += nums[i] ;
		}
		if(leftsum == rightSum)
			return 0 ;
		for(int i = 1 ; i < nums.length ;i++) {
			leftsum = leftsum + nums[i - 1] ;
			rightSum = rightSum - nums[i ] ;
			if(leftsum == rightSum )
				return i ;
		}
		return -1 ;
	}
}
