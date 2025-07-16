/*
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
Example: Input: head = [1,2,3,4]  Output: [2,1,4,3]
 */
public class Q7Sol1 {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null && head.next != null) {
            ListNode curr = head;
            ListNode next = head.next;
            prev.next = next;
            curr.next = next.next;
            next.next = curr;
            prev = curr;
            head = curr.next;
        }
        return dummy.next;
    }
}
