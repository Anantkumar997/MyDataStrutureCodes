package L_42_BitManipulation;
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mult = 1;
		int binary =  0;
		
		while (n != 0) {
			int rem = n % 10 ;
			int temp = rem * mult ;
			binary += temp ;
			mult *= 2 ;
			n /= 10 ;
		}
		System.out.println(binary);

	}

}
