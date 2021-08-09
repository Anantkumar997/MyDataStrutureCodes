package L_42_BitManipulation;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n != 0 && (n & (n - 1 )) == 0) 
			System.out.println("power of 2");
		else
			System.out.println("Not a power of 2");
			
		sc.close();	

	}

}
