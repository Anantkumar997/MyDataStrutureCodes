package Qps;

public class FindLargestPrime {

	public static void main(String[] args) {
		int[] arr = {1,3,5,8,10,15};
		System.out.println(FindLargestPrime(arr, 0));
	}

	private static int FindLargestPrime(int[] arr, int curr) {
		if(curr > arr.length) {
			return 0;
		}
		  int ans = FindLargestPrime(arr, curr + 1);
		  if(checkPrime(arr[curr]))
			  return arr[curr];
		  
		  return ans;
		
	}
	public static boolean checkPrime(int n) {
		int count = 0;
		for(int i = 2 ; i < Math.sqrt(n); i++) {
			if(n % i == 0) {
				count++;
				break;
			}
		}
		if(count > 0) {
			return false;
		}
		return true;
	}

}
