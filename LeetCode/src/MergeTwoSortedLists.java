
/*
21. Merge Two Sorted Lists

Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.

*/

public class MergeTwoSortedLists {
	
	public static void main(String[] args) {
		ListNode root = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		root.next = three;
		two.next = four;
		four.next = five;
		System.out.println(new MergeTwoSortedLists().mergeTwoLists(root, two));
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode headNode = new ListNode(l1.val < l2.val ? l1.val : l2.val);
		ListNode currentL1Node = l1;
		ListNode currentL2Node = l2;
		ListNode tmpNode = headNode;
		while (currentL1Node != null && currentL2Node != null) {
			if (currentL1Node.val < currentL2Node.val) {
				tmpNode.next = new ListNode(currentL1Node.val);
				currentL1Node = currentL1Node.next;
			} else {
				tmpNode.next = new ListNode(currentL2Node.val);
				currentL2Node = currentL2Node.next;
			}
			tmpNode = tmpNode.next;
		}

		if (currentL1Node == null) {
			tmpNode.next = currentL2Node;
		}

		if (currentL2Node == null) {
			tmpNode.next = currentL1Node;
		}

		return headNode;

	}
}
