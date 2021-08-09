package Qps;

public class checkString {

	public static void main(String[] args) {
		String str = "banana";
		int n = str.length();
		String[] arr = {"bana", "apple", "banana", "bananza"};
		int count = 0;
		boolean ans = false;
		for(int i = 0 ; i < arr.length ; i++) {
			String str2 = arr[i];
			if(str2.length() == n) {
				for(int j = 0 ; j < n; j++) {
					if(str.charAt(j) != str2.charAt(j)) {
						count++;
					}
				}
				if(count == 1) {
					ans = true;
					break;
				}
			}
		}
		System.out.println(ans);
	}

}
