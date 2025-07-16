public class Q8Sol2 {
    public static ListNode removeNode(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode front = dummy, back = dummy;

        for (int i = 0; i < n; i++) {
            front = front.next;
        }
        while (front.next!=null) {
            front=front.next;
            back = back.next;
        }
        back.next = back.next.next;
        return dummy.next;
    }
}
