package L_42_BitManipulation;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mult = 1;
		int binary =  0;
		
		while (n != 0) {
			int rem = n % 2 ;
			int temp = rem * mult ;
			binary += temp ;
			mult *= 10 ;
			n /= 2 ;
		}
		System.out.println(binary);

	}

}
