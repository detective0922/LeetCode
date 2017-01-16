
/*
206. Reverse Linked List

Reverse a singly linked list.

*/

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode previousNode = null;
		ListNode currentNode = head;
		while (currentNode != null) {
			ListNode nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;

	}

}
