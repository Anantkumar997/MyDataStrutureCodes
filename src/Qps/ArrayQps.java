package Qps;

public class ArrayQps {

	public static void main(String[] args) {
		int[] arr = {1,-2,1};
		System.out.println(kConcatenationMaxSum(arr, 5));

	}
	public static int  kConcatenationMaxSum(int[] arr,int k) {
		int sum = 0 ;
		for (int val : arr) {
			sum += val;
		}
		if(k == 0) {
			return kadane(arr);
		}else if(sum < 0) {
			return kadane2Repeat(arr) ;
		}else {
			return kadane2Repeat(arr) + (k - 2)*sum ;
		}
	}
	public static int kadane2Repeat(int[] arr) {
		int[] na = new int[arr.length * 2] ;
		for(int i = 0 ; i < arr.length ; i++) {
			na[i] = arr[i];
			na[arr.length + i] = arr[i] ;
		}
		return kadane(na);
	}

	public static int  kadane(int[] arr) {
		int sum = arr[0];
		int max = arr[0];
		for(int i= 1 ; i < arr.length;i++) {
			sum = Math.max(sum + arr[i], arr[i]);
			if(sum > max)
				max = sum ;
		}
		if(max < 0)
			max = 0 ;
		
		return max;
	}
}
