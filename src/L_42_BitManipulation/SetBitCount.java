package L_42_BitManipulation;

import java.util.Scanner;

public class SetBitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println(Integer.toBinaryString(x));
		
		int count = 0;
		while (x != 0) {
			if ((x & 1) == 1 ) 
				count++;
			
			x >>= 1;
		}
		System.out.println(count);
	}

}
