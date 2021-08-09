package L46_HashMap;

import java.util.*;



public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		// put
		map.put("India", 10);
		map.put("US", 20);
		map.put("UK", 5);
		map.put("Aus", 5);
		
		System.out.println(map);
		
		// get
		System.out.println(map.get("US"));
		System.out.println(map.containsKey("UK"));
		System.out.println(map.remove("UK"));
		System.out.println(map);
		map.put("Russia", 10);
		map.put("India", 50);
		System.out.println(map);
		System.out.println(map.keySet());
		// way 1
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " -> " + map.get(key));
		}
		// way 2
		for (String key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}
		// way 3
		ArrayList<String> list = new ArrayList<>(map.keySet());
		System.out.println(list);
	}

}
