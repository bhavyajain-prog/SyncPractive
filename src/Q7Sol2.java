public class Q7Sol2 {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
