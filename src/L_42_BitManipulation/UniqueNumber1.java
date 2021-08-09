package L_42_BitManipulation;

public class UniqueNumber1 {

	public static void main(String[] args) {
		int[] arr = {20,40,15,20,30,40,15};
		int ans = 0 ;
		for(int val : arr) 
			ans = ans ^ val ;
		
		System.out.println(ans);

	}

}
