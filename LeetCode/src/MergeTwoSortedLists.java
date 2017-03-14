
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

	}
}
