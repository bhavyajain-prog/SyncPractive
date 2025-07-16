/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Example: Input: head = [1,2,3,4,5], n = 2 Output: [1,2,3,5]
 */
public class Q8Sol1 {
    public static ListNode removeNode(ListNode head, int n) {
        int len = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        int temp = len - n;
        curr = dummy;
        for (int i = 0; i < temp; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return dummy.next;
    }
}
