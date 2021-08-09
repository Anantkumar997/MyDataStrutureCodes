package LinkedList;

import LinkedList.MergeTwoSortedLL.ListNode;

public class LLPalindrom {

	public static void main(String[] args) {

	}
	ListNode left ;
	public boolean isPalindrom(ListNode head) {
		left = head ;
		return isPalindromR(head) ;
		
	}
	
	public boolean isPalindromR(ListNode right) {
		if(right == null)
			return true ;
		
		boolean res = isPalindromR(right.next) ;
		
		if(left.val == right.val && res) {
			left = left.next ;
			return true ;
		}else {
			left = left.next ;
			return false ;

		}
	}

}
