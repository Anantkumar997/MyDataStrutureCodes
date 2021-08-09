package Qps;

import java.util.HashSet;

public class Subarray0Sum {

	public static void main(String[] args) {
		int[] arr = {4,2,-3,1,6};
		System.out.println(subarray0Sum(arr));
	}
	public static boolean subarray0Sum(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		set.add(0);
		
		int sum = 0 ;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			if(set.contains(sum))
				return true ;
			
			set.add(sum);
		}
		
		return false ;
	}

}
