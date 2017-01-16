
/*
206. Reverse Linked List

Reverse a singly linked list.

*/

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode previousNode = null;
		while (head != null) {
			ListNode nextNode = head.next;
			head.next = previousNode;
			previousNode = head;
			head = nextNode;
		}
		return previousNode;

	}

}
