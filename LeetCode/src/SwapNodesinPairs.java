/*
24. Swap Nodes in Pairs

Given a linked list, swap every two adjacent nodes and return its head.

For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

*/
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode currNode = newHead;

        while (currNode != null && currNode.next !=null) {
            ListNode tmpNode = currNode.next;
            currNode.next = currNode.next.next;
            tmpNode.next = tmpNode.next.next;
            currNode.next.next = tmpNode;
            currNode = currNode.next.next;
        }
        return newHead.next;
    }

}
