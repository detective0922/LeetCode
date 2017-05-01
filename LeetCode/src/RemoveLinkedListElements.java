/*
203. Remove Linked List Elements

Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5

*/

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(6);
        root.next = two;
        two.next = six;
        six.next = three;
        three.next = four;
        four.next = five;
        five.next = seven;
        System.out.println(new RemoveLinkedListElements().removeElements(root, 6));
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode tmpHead = new ListNode(0);
        tmpHead.next = head;
        ListNode currNode = tmpHead;
        while (currNode != null && currNode.next != null) {
            if (currNode.next.val == val){
                currNode.next = currNode.next.next;
            }
            currNode = currNode.next;
        }
        return tmpHead;
    }
}
