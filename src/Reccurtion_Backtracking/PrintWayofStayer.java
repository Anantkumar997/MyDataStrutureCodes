package Reccurtion_Backtracking;


public class PrintWayofStayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbingStairs(0, 5, "");
	}
	public static void ClimbingStairs(int curr,int n,String ans) {
		if(curr == n) {
			System.out.println(ans);
			return;
		}
		if(curr > n)
			return;
		ClimbingStairs( curr + 1, n, ans + "1");
		ClimbingStairs( curr + 2, n, ans + "2");
		ClimbingStairs( curr + 3, n, ans + "3");
	}

}
