
/*
206. Reverse Linked List

Reverse a singly linked list.

*/

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode newHead = null;
		while (head != null) {
			ListNode temp = head.next;
			
			head = temp;
		}

	}

}
