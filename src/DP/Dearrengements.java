package DP;

public class Dearrengements {

	public static void main(String[] args) {
		int n = 43;
		
		//System.out.println(dearrengementsTDDP(n,new int[n+1]));
		System.out.println(dearrengementsBUDP(n));
	}
	
	public static int dearrengementsRec(int n) {
		if(n == 1 || n == 2)
			return n-1 ;
		
		int deal = dearrengementsRec(n - 2) ;
		int Nodeal = dearrengementsRec(n - 1) ;
		
		int specificPositionTotal = deal + Nodeal ;
		
		int total = (n - 1) * specificPositionTotal ;
		
		return total ;
	}
	
	public static int dearrengementsTDDP(int n,int[] strg) {
		if(n == 1 || n == 2)
			return n-1 ;
		if(strg[n] != 0)
			return strg[n] ;
		
		int deal = dearrengementsTDDP(n - 2,strg) ;
		int Nodeal = dearrengementsTDDP(n - 1,strg) ;
		
		int specificPositionTotal = deal + Nodeal ;
		
		int total = (n - 1) * specificPositionTotal ;
		
		strg[n] = total ;
		
		return total ;
	}
	
	public static int dearrengementsBUDP(int n) {
		int[] strg = new int[n + 1] ;
		strg[1] = 0 ;
		strg[2] = 1 ;
		for(int i = 3 ; i <= n ; i++) {
			int deal = strg[i - 2] ;
			int Nodeal = strg[i - 1] ;
			
			int specificPositionTotal = deal + Nodeal ;
			
			int total = (i - 1) * specificPositionTotal ;
			
			strg[i] = total ;
		
		}
		
		return strg[n] ;
	}

}
