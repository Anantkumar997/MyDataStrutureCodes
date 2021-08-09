package L46_HashMap;

public class HashMap {

	private class Node{
		String key ;
		Integer value ;
		Node next ;
		public Node(String key, Integer value) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	Node[] bucketArray ;
	int size ;
	
	public HashMap() {
		this(4);
	}
	public HashMap(int cap) {
		bucketArray = new Node[cap];
		size = 0;
	}
	private int  hashfunc(String key) {
		int hc = key.hashCode();
		int bn = hc % bucketArray.length;
		return bn ;
	}
	public void put(String key,Integer value) {
		int bn = hashfunc(key);
		Node temp = bucketArray[bn];
		
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		// code flow area : key wasn't present
		
		Node nn = new Node(key,value);
		Node head = bucketArray[bn];
		
		nn.next = head;
		bucketArray[bn] = nn;
		
		size++;
		// load factor
		double lf = (1.0 * size) / bucketArray.length;
		int threshold = 2 ;
		if(lf > threshold)
			rehash();	
		}
	
	private void rehash() {
		Node[] oba = bucketArray;
		Node[] nba = new Node[bucketArray.length * 2];
		
		bucketArray = nba;
		size = 0 ;
		for(Node temp : oba) {
			while (temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}
		
	}
	public Integer get(String key) {
		int bn = hashfunc(key);
		Node temp = bucketArray[bn];
		while(temp != null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null ;
	}
	public boolean containskey(String key) {
		int bn = hashfunc(key);
		Node temp = bucketArray[bn];
		while(temp != null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false ;
	}
	
	public Integer remove(String key) {
		int bn = hashfunc(key);
		Node temp = bucketArray[bn];
		Node prev = null;
		
		while (temp != null) {
			if(temp.key.equals(key)) {
				break;
			}
			prev = temp ;
			temp = temp.next ;
		}
		if(temp == null) {
			return null;
		}
		// if break executed
		if(prev == null) {
			bucketArray[bn] = temp.next;
		}else {
			prev.next = temp.next;
		}
		size--;
		return temp.value;
		
	}
	@Override
	public String toString() {
		String str = "" ;
		for(Node temp : bucketArray) {
			while(temp != null) {
				str += temp.key + " = " + temp.value + ",";
				temp = temp.next;
			}
		}
		return str;
	}
	
	
}
