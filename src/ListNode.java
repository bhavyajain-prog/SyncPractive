public class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode head = this;
        while (head.next!=null) {
            sb.append(head.val).append(" -> ");
            head=head.next;
        }
        sb.append(head.val);
        return sb.toString();
    }
}
