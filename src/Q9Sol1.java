/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.
Example: Input: lists = [[1,4,5],[1,3,4],[2,6]] Output: [1,1,2,3,4,4,5,6]
 */
public class Q9Sol1 {
    public static ListNode mergeKLists(ListNode[] lists) {
        return mergeList(lists, 0, lists.length - 1);
    }

    private static ListNode mergeList(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left];
        if (left + 1 == right) return mergeTwoLists(lists[left], lists[right]);
        int mid = (left + right) / 2;
        return mergeTwoLists(mergeList(lists, left, mid), mergeList(lists, mid + 1, right));
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                curr.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
}
