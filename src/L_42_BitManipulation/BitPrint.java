package L_42_BitManipulation;

import java.util.Scanner;

public class BitPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		//	way 1
		while (x != 0) {
			int rem = x % 2;
			System.out.println(rem);
			x /= 2;
		}
		
		//way 2
		System.out.println("---------------------");
		
		while (y != 0) {
			int rem = y & 1;
			System.out.println(rem);
			y >>= 1;
		}
	}

}
