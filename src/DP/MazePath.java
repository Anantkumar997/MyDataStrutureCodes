package DP;

import java.util.Arrays;

public class MazePath {

	public static void main(String[] args) {
		int n = 8000 ;
		int m = 8000;
		//System.out.println(mazeRec(0, 0, n - 1, m -1));
		//System.out.println(mazeTDDP(0, 0, n - 1, m -1, new int[n + 1][m + 1]));
		System.out.println(mazeBUDP( n - 1, m -1));
		System.out.println(mazeBUSE( n - 1, m -1));

	}
	
	public static int mazeRec(int cr, int cc, int er, int ec) {
		if(cr == er && cc == ec)
			return 1 ;
		
		if(cr > er || cc > ec)
			return 0 ;
		
		int right = mazeRec(cr, cc + 1,er, ec);
		int down = mazeRec(cr + 1, cc, er, ec);
		
		return right + down ;
	}
	
	public static int mazeTDDP(int cr, int cc, int er, int ec, int[][] dp) {
		if(cr == er && cc == ec)
			return 1 ;
		
		if(cr > er || cc > ec)
			return 0 ;
		if(dp[cr][cc] != 0)
			return dp[cr][cc] ;
		int right = mazeTDDP(cr, cc + 1,er, ec, dp);
		int down = mazeTDDP(cr + 1, cc, er, ec, dp);
		
		 
		return dp[cr][cc] = right + down ;
	}

	public static int mazeBUDP( int er, int ec) {
		int[][] dp = new int[er + 2][ec + 2];
		for(int row = er ; row >= 0 ; row--) {
			for(int col = ec ; col >= 0; col--) {
				if(row == er && col == ec)
					dp[row][col] = 1;
				else {
					dp[row][col] = dp[row][col + 1] + dp[row +1][col];
				}
			}
		}
		return dp[0][0];
	}

	public static int mazeBUSE(int er, int ec) {
		int[] strg = new int[ec + 1];
		Arrays.fill(strg, 1);
		
		for(int i = er -1 ; i >= 0 ;i--) {
			for(int col = ec ; col >= 0 ; col--) {
				if(col == ec)
					strg[col] = 1 ;
				else {
					strg[col] = strg[col] + strg[col + 1];
				}
			}
		}
		return strg[0] ;
	}
}
