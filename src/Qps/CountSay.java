package Qps;

public class CountSay {

	public static void main(String[] args) {
		System.out.println(CountAndSay(5));

	}
	public static String CountAndSay(int n) {
		if(n == 1)
			return "1";
		String rr = CountAndSay(n - 1 );
		return compress(rr);
	}
	public static String compress(String str) {
		
		String ans = "";
		int count = 1 ;
		for(int i = 0 ; i <= str.length() - 2 ; i++) {
			
			if(str.charAt(i) == str.charAt(i + 1)) {
				count++;
			}else {
				ans = ans + count + str.charAt(i) ;
				count = 1 ;
			}
		}
		ans = ans + count + str.charAt(str.length() - 1) ;
		return ans ;
	}

}
