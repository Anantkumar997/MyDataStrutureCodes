package Reccurtion_Backtracking;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fact(n));
	}
	public static int fact(int n) {
		if(n == 0)
			return 1;
		
		return n * fact(n - 1);
	}

}
