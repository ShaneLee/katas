class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        final var n = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return n;
    }
}
