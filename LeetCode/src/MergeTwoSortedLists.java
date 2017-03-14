
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

		ListNode headNode = l1.val < l2.val ? l1 : l2;
		ListNode currentL1Node = l1;
		ListNode currentL2Node = l2;
		ListNode tmpNode = headNode;
		while (currentL1Node != null && currentL2Node != null) {
			if (currentL1Node.val < currentL2Node.val) {
				tmpNode.next = currentL1Node;
				currentL1Node = currentL1Node.next;
			} else {
				tmpNode.next = currentL2Node;
				currentL2Node = currentL2Node.next;
			}
		}

		if (currentL1Node == null) {
			tmpNode.next = currentL2Node;
		}

		if (currentL1Node == null) {
			tmpNode.next = currentL2Node;
		}

		return headNode;

	}
}
