package Loops;
import java.util.*;
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int divident = sc.nextInt();
		int divisor = sc.nextInt();
		
		while(true) {
			
			int rem = divident % divisor;
			
			if(rem == 0) {
				break;
			}
			
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
		

	}

}
