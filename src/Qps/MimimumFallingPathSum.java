package Qps;

public class MimimumFallingPathSum {

	public static void main(String[] args) {
		int[][] arr = {{2,1,3},{6,5,4},{7,8,9}} ;
		System.out.println(minFallingPathSumBUDP(arr));

	}
	public static int minFallingPathSumBUDP(int[][] arr) {
        int n = arr.length;
        int[][] strg = new int[n][n] ;
        
        for (int r = n - 1; r >= 0; r--) {
			
        	for (int c = 0; c < n; c++) {
				if(r == n -1) {
					strg[r][c] = arr[r][c] ;
				}else {
					int dleft = Integer.MAX_VALUE;
					int dright = Integer.MAX_VALUE ;
					
					if(c - 1 >= 0)
						dleft = strg[r + 1][c - 1];
					
					int below = strg[r + 1][c] ;
					
					if(c + 1 < n)
						dright = strg[r + 1][c + 1] ;
					
					int ans = Math.min(dleft, Math.min(dright, below)) + arr[r][c] ;
					
					strg[r][c] = ans ;
				}
			}
		}
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i < n ; i++) {
        	min = Math.min(min, strg[0][i]) ;
        }
        return min ;
    }

}
