package L_42_BitManipulation;

public class HammingDistance {

	public static void main(String[] args) {

		int x = 6 ;
		int y = 4 ;
		
		int xor = x ^ y;
		int count = 0;
		
		while(xor > 0) {
			if((xor & 1) == 1) {
				count++;
			}
			xor >>= 1;
			
		}
		System.out.println(count);
			
	}

}
