/*
24. Swap Nodes in Pairs

Given a linked list, swap every two adjacent nodes and return its head.

For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

*/
public class SwapNodesinPairs {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(6);
        root.next = two;
        two.next = three;
        new SwapNodesinPairs().swapPairs(root);
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode currNode = newHead;

        while (currNode != null && currNode.next != null && currNode.next.next != null) {
            ListNode tmpNode = currNode.next;
            currNode.next = currNode.next.next;
            tmpNode.next = tmpNode.next.next;
            currNode.next.next = tmpNode;
            currNode = currNode.next.next;
        }
        return newHead.next;
    }

}
