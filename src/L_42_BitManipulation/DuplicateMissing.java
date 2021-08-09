package L_42_BitManipulation;

public class DuplicateMissing {

	public static void main(String[] args) {
		int n = 6;
		int[] arr = {1,2,3,2,5,6};
		
		int xor = 0;
		
		for (int val : arr) 
			xor ^= val;
		
		for (int i = 0; i <= n; i++) {
			xor ^= i;
		}
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
		for (int val = 1 ; val <= n; val++) {
			if((val & rmsbmask) == 0)
				n1 ^= val;
			else {
				n2 ^= val;
			}
		}
		
		
		//System.out.println(n1 + " " + n2);
		
		for (int val : arr) {
			if (val == n1) {
				System.out.println("Duplicate No : " + n1);
				System.out.println("Missing No : " + n2);
				break;
			} else if (val == n2) {
				System.out.println("Duplicate No : " + n2);
				System.out.println("Missing No : " + n1);
				break;
			}
		}
	}

}
