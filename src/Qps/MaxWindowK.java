package Qps;

import java.util.Deque;
import java.util.LinkedList;

public class MaxWindowK {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6} ;
		int k = 4 ;
		
		Deque<Integer> q = new LinkedList<>() ;
		
		for (int i = 0; i < k; i++) {
			while(!q.isEmpty() && arr[i] >= arr[q.peekLast()]) {
				q.removeLast() ;
			}
			q.add(i) ;
		}
		System.out.println(arr[q.peekFirst()]);
		
		for (int i = k; i < arr.length; i++) {
			// out of window
			if(!q.isEmpty() && q.peekFirst() == i - k) {
				q.removeFirst() ;
			}
			//new value remove, smaller value remove
			while(!q.isEmpty() && arr[i] >= arr[q.peekFirst()]) {
				q.removeLast() ;
			}
			//self add
			q.addLast(i);
			// ans
			
			System.out.print(arr[q.peekFirst()] +" ");
		}
	}

}
