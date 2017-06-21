/*
328. Odd Even Linked List

Given a singly linked list, group all odd nodes together followed by the even nodes.
Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.



Example:
 Given 1->2->3->4->5->NULL,
 return 1->3->5->2->4->NULL.

Note:
 The relative order inside both the even and odd groups should remain as it was in the input.
 The first node is considered odd, the second node even and so on ...


*/
public class OddEvenLinkedList {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        root.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        System.out.println(new RemoveDuplicatesfromSortedList().deleteDuplicates(root));
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode firstEvenNode = head.next;
        ListNode tmpOddNode = head;
        ListNode tmpEvenNode = head.next;
        while (tmpOddNode != null && tmpEvenNode !=null) {
            tmpOddNode.next = tmpEvenNode.next;
            tmpEvenNode.next = tmpOddNode.next;
            tmpOddNode = tmpOddNode.next;
            tmpEvenNode = tmpEvenNode.next;
        }
        tmpOddNode.next = firstEvenNode;
        return head;
    }

}
