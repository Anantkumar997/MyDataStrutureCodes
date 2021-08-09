package DP;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100000;
		//System.out.println(fibbTD(n, new int[n+1]));
		System.out.println(fibbBUSE(7));
	}

	public static int fibb(int n) {
		if(n == 0 || n == 1)return n;
		return fibb(n-1) + fibb(n-2);
	}
	
	public static int fibbTD(int n, int[] strg) {
		if(n == 0 || n == 1)return n;
		if(strg[n] != 0) {   // re-use
			return strg[n];
		}
		
		int fn = fibbTD(n-1,strg) + fibbTD(n-2,strg);
		
		strg[n] = fn;  //store
		
		return fn;
	}
	
	public static int fibbBU(int n) {
		
		int[] strg = new int[n+1];
		strg[0] = 0;
		strg[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i-1] + strg[i-2];
		}
		
		return strg[n];
	}
	
	public static int fibbBUSE(int n) {
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		
		for (int slide = 1; slide <= n - 1; slide++) {
			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}
		
		return strg[1];
	}
}
