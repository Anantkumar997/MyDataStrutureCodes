package DP;

public class MinStepto1 {

	public static void main(String[] args) {
		int n = 10 ;
		System.out.println(minStepsTDDP(n,new int[n+1]));
		System.out.println(minStepsBUDP(n));
	}
	
	public static int minStepsRec(int n) {
		
		if(n == 1)
			return 0 ;
		
		int ans = minStepsRec(n - 1);
		
		if(n % 2 == 0)
			ans = Math.min(ans, minStepsRec(n/2));
		
		if(n % 3 == 0)
			ans = Math.min(ans, minStepsRec(n/3));
		
		return ans + 1 ;
	}
	
	public static int minStepsTDDP(int n,int[] strg) {
		
		if(n == 1)
			return 0 ;
		
		if(strg[n] != 0)
			return strg[n] ;
		
		int ans = minStepsTDDP(n - 1,strg);
		
		if(n % 2 == 0)
			ans = Math.min(ans, minStepsTDDP(n/2,strg));
		
		if(n % 3 == 0)
			ans = Math.min(ans, minStepsTDDP(n/3,strg));
		
		strg[n] = ans ;
		
		return ans + 1 ;
	}
	
	public static int minStepsBUDP(int n) {
		int[] strg = new int[n + 1] ;
		strg[1] = 0 ;
		
		for(int i = 2 ; i <= n ; i++) {
		
			int ans = strg[i - 1];
			
			if(i % 2 == 0)
				ans = Math.min(ans, strg[i / 2]);
			
			if(i % 3 == 0)
				ans = Math.min(ans, strg[i / 3]);
			
			strg[i] = ans + 1 ;
		}
		
		return strg[n] ;
	}
}
