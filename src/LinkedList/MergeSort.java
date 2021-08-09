package LinkedList;

import LinkedList.MergeTwoSortedLL.ListNode;

public class MergeSort {

	public static void main(String[] args) {

	}
	
	public ListNode mergeTwoListsRec(ListNode h1, ListNode h2) {
		if(h1 == null)
			return h2 ;
		
		if(h2 == null)
			return h1 ;
		
		if(h1.val <= h2.val) {
			h1.next = mergeTwoListsRec(h1.next, h2) ;
			return h1 ;
		}else {
			h2.next = mergeTwoListsRec(h1, h2.next) ;
			return h2 ;
		}
	}
	
	public ListNode mid(ListNode head) {
		ListNode slow = head ;
		ListNode fast = head ;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next ;
			fast = fast.next.next ;
		}
		
		return slow ;
	}
	
	public ListNode sortList(ListNode h1) {
		
		if(h1 == null || h1.next == null) {
			return h1 ;
		}
		
		ListNode midNode = mid(h1) ;
		ListNode h2 = midNode.next ;
		midNode.next = null ;
		
		ListNode sfph = sortList(h1) ;
		ListNode ssph = sortList(h2) ;
		
		ListNode merged = mergeTwoListsRec(sfph, ssph) ;
		
		return merged ;
	}
}
