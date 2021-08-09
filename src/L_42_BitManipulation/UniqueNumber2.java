package L_42_BitManipulation;

public class UniqueNumber2 {

	public static void main(String[] args) {
		int[] arr = {36,50,24,56,36,42,50,24};
		
		int xor = 0;
		
		for (int val : arr) 
			xor ^= val;
		
		int rmsbmask = xor & (-xor);
		
		int n1 = 0;
		int n2 = 0;
		
		for (int val : arr) {
			if((val & rmsbmask) == 0)
				n1 ^= val;
			else {
				n2 ^= val;
			}
		}
		
		System.out.println(n1 + " " + n2);
	}

}
