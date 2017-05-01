/*
203. Remove Linked List Elements

Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5

*/

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode tmpHead = new ListNode(0);
        tmpHead.next = head;
        ListNode currNode = tmpHead;
        while (currNode != null && currNode.next != null) {
            if (currNode.val == val){
                tmpHead
            }

        }

    }
}
