package Qps;

import java.util.Arrays;

public class SumSubseqWidths {

	public static void main(String[] args) {
		int[] arr = {2,1,3} ;
		System.out.println(sumSubseqWidths(arr));
	}
	public static int sumSubseqWidths(int[] arr) {
		int n = arr.length ;
		Arrays.sort(arr);
		
		int mod = 1000_000_007 ;
		
		long[] power = new long[n];
		power[0] = 1 ;
		
		for(int i = 1 ; i < n ; i++) {
			power[i] =(power[i-1]*2) % mod ;
		}
		
		long max = 0 ;
		long min = 0 ;
		 for (int i = 0; i < n ; i++) {
			
			  max = (max + arr[i] * power[i]) % mod ;
			  min = (min + arr[i] * power[n - i - 1]) % mod ;
		}
		 
		return (int)(max - min + mod) % mod ;
	}

}
