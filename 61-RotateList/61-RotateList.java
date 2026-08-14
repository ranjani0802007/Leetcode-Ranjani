// Last updated: 8/14/2026, 12:03:19 PM
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        tail.next = head; // make circular
        k %= len;
        for (int i = 0; i < len - k; i++)
            tail = tail.next;
        head = tail.next;
        tail.next = null;
        return head;
    }
}