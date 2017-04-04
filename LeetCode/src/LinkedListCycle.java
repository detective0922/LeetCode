/*
141. Linked List Cycle

Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

*/

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode walker = null;
        ListNode runner = null;
        while (head !=null && head.next != null) {
            walker = head;
            runner = head.next;
        }

    }
}
