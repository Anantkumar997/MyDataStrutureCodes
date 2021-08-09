package L46_HashMap;

import java.util.HashMap;

public class HAshMapOps {

	public static void main(String[] args) {
		String str = "abccdbca";
		System.out.println(maxFreqChar(str));
		
		int[] one = {10,5,6,20,30,30,40,10,5,20,20,20};
		int[] two = {30,30,30,20,20,100,75,68};
		Intersection(one, two);
	}
	public static char maxFreqChar(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
//			if(map.containsKey(ch)) 
//				map.put(ch, map.get(ch) + 1);
//			else 
//				map.put(ch, 1);
			int nf = map.getOrDefault(ch, 0) + 1 ;
			map.put(ch, nf);
		}

		int max = 0 ;
		char maxFreqChar = ' ';
		for (char key : map.keySet()) {
			int val = map.get(key);
			if(val > max) {
				max = val ;
				maxFreqChar = key ;
			}
		}
		return maxFreqChar;
	}

	public static void Intersection(int[] one,int[] two) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int key : one) {
			int nf = map.getOrDefault(key, 0) + 1 ;
			map.put(key, nf);
		}
		
		for (int key : two) {
			if(map.containsKey(key) && map.get(key) > 0) {
				System.out.println(key);
				map.put(key, map.get(key) - 1);
			}
		}
	}
	
	
}