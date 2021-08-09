package Qps;

public class sTringCallenge {

	public static void main(String[] args) {

		String str = "cats AND*Dogs-are- Awesome";
		String ans = "";
		if(str.charAt(0)>96 && str.charAt(0)<123) {
			ans += (char)(str.charAt(0) - 32);
		}
		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			char ch1 = str.charAt(i-1);
			if(str.charAt(i)>96 && str.charAt(i)<123) {
				if(ch1 == ' ' || ch1 == '-' || ch1 == '%' || ch1 == '*') {
					ans += (char)(str.charAt(i) - 32);
				}else
					ans += (char)(str.charAt(i));
			}else if(str.charAt(i)>64 && str.charAt(i)<91) {
				char ch2 = str.charAt(i-1);
				if(ch1 == ' ' || ch1 == '-' || ch1 == '%' || ch1 == '*') {
					ans += (char)(str.charAt(i));
				}else
					ans += (char)(str.charAt(i) + 32);
			}
		}
		System.out.println(ans);
	}
}
