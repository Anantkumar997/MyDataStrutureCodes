package Qps;

public class UglyNumber {

	public static void main(String[] args) {
		int n = 12 ;
		System.out.println(nthUglyno(n));
	}
	
	public static int nthUglyno(int n) {
		int[] strg = new int[n + 1] ;
		strg[0] = 1 ;
		
		int i2 = 0 ;
		int i3 = 0 ;
		int i5 = 0 ;
		for(int i = 1 ; i <= n ; i++) {
			int condidate2 = 2 * strg[i2] ;
			int condidate3 = 3 * strg[i3] ;
			int condidate5 = 5 * strg[i5] ;
			
			int minimum = Math.min(condidate2, Math.min(condidate3, condidate5)) ;
			strg[i] = minimum ;
			
			if(minimum == condidate2)
				i2++;
			
			if(minimum == condidate3)
				i3++;
			
			if(minimum == condidate5)
				i5++;
		}
//		for (int i = 0 ; i < strg.length ; i++) {
//			System.out.println(i + "-->" +strg[i]);
//		}
		
		return strg[n - 1] ;
	}
}
