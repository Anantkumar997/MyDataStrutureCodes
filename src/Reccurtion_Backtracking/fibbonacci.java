package Reccurtion_Backtracking;

public class fibbonacci {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibb(5));

	}
	
	public static int fibb(int n) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		
		int fnm1 = fibb(n-1);
		int fnm2 = fibb(n-2);
		
		return fnm1 + fnm2;
	}


}
