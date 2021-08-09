package L_42_BitManipulation;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = 0 ;
		int mul = 1 ;
		while (n != 0) {
			if((n & 1) == 1)
				ans += mul ;
			
			mul *= 5;
			n >>= 1 ;
		}
		
		System.out.println(ans);

	}

}
