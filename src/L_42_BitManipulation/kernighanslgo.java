package L_42_BitManipulation;

import java.util.Scanner;

public class kernighanslgo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println(Integer.toBinaryString(x));
		
		int count = 0;
		while (x != 0) {
			int rsmbmask = (x & (-x));
			x -= rsmbmask;
			count++;
			
		}
		System.out.println(count);
	}

}
