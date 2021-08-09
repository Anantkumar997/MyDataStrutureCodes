package Qps;

import java.util.Arrays;

public class addUsingWithOutEarthmaticOparator {

	public static void main(String[] args) {
		// xor with out using xor oparator(^)
		int n = 8;
		int m = 6;
		System.out.println(n^m);
		System.out.println((~n&m) | (n&~m));
		
		
//		int a = 3,i=12,j=14,k=13;
//		System.out.println(a+=2*i++%5*4+--j-3/k+2);
		
		// multiply a no with 7 with out using * and + 
		System.out.println((n<<3) - n);
		
		// multiply two no with using bitwise operator
		int res = 0 ;
		while(m>0) {
			if((m&1) == 1)
				res += n;
			
			n <<= 1;
			m >>= 1 ;
		}
		System.out.println(res);
		System.out.println(hcf(6, 8));
		System.out.println(hcfRecursion(48, 36));
		System.out.println(lcm(6, 8));
		int[] arr = {4,2,5,9,3};
		leftRotation(arr);
		System.out.println(Arrays.toString(arr));
		rightRotation(arr);
		System.out.println(Arrays.toString(arr));
	}
	// hcf of two no.
	public static int hcf(int a, int b) {
		int min = Math.min(a, b);
		//System.out.println();
		int ans = 1 ;
		for(int i = 2 ; i <= min ;i++) {
			if((a % i == 0) && (b % i == 0)) {
				ans = i ;
			}	
		}
		return ans ;
	}
	
	public static int hcfRecursion(int a, int b) {
		if(b==0)
			return a;
		return hcfRecursion(b, a%b);
	}
	// lcm of two no.
	public static int lcm(int a,int b) {
		return (a*b)/hcf(a, b);
	}
	
	// left array rotation
	public static void leftRotation(int[] arr) {
		int temp = arr[0];
		for(int i = 1; i < arr.length ;i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp ;
	}
	
	// Right array Rotation
	public static void rightRotation(int[] arr) {
		int temp = arr[arr.length-1];
		for(int i = arr.length-2; i >= 0 ;i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = temp ;
	}
	
}
