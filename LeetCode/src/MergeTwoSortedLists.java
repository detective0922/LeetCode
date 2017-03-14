
/*
21. Merge Two Sorted Lists

Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.

*/

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		
		ListNode headNode = null;
		ListNode currentL1Node = null;
		ListNode currentL2Node = null;
		if (l1.val < l2.val) {
			headNode = l1;
			currentL1Node = l1;
			currentL2Node = l2.next;
		} else {
			
		}
		ListNode currentNode = headNode;
		while (headNode!=null) {
			
		}
		

	}
}
