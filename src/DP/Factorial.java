package DP;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		int n = 70 ;
		System.out.println(fact(n));
	}

	public static BigInteger fact(int n) {
		BigInteger ans = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			ans = ans.multiply(BigInteger.valueOf(i));
		}
		return ans ;
	}
}
