package io.kuankuan.leetcode;

import io.kuankuan.leetcode.model.ListNode;

/**
 * @author Kuankuan Yang
 * @date 2021-12-02 16:49
 */
public class Problem328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
