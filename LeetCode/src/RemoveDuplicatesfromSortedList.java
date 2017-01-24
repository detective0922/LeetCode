
/*
83. Remove Duplicates from Sorted List 

Given a sorted linked list, delete all duplicates such that each element appear only once. 

For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3. 

*/

public class RemoveDuplicatesfromSortedList {
	
	public static void main(String[] args) {
		ListNode root = new ListNode(1);
		ListNode two = new ListNode(1);
		ListNode three = new ListNode(2);
		ListNode four = new ListNode(3);
		ListNode five = new ListNode(3);
		root.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		System.out.println(new RemoveDuplicatesfromSortedList().deleteDuplicates(root));
	}
	
	public ListNode deleteDuplicates(ListNode head) {
		
		ListNode currentNode = head;
		while(currentNode != null) {
			ListNode nextNode = currentNode.next;
			if (currentNode.val == nextNode.val) {
				currentNode.next = nextNode.next;
			}
			currentNode = currentNode.next;
		}
		return currentNode;

	}
}
