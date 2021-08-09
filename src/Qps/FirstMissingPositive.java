package Qps;

public class FirstMissingPositive {

	public static void main(String[] args) {

		int[] arr = {1,0,2};
		System.out.println(firstMissingPositive(arr));
	}
	
	public static int firstMissingPositive(int[] arr) {
		int n = arr.length ;
		
		// step 1
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] <= 0 || arr[i] > n)
				arr[i] = n + 1 ;
		}
		
		// Step 2 value which are present mark -ve
		for(int i = 0 ; i < n ;i++) {
			int val = Math.abs(arr[i]) -1 ;
			
			if(val != n && arr[val] > 0)
				arr[val] = -arr[val] ;
		}
		
		for(int i = 0 ; i < n ;i++) {
			if(arr[i] > 0)
				return i + 1 ;
		}
		
		return n + 1 ;
	}
}
