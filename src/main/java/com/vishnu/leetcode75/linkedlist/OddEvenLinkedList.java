package com.vishnu.leetcode75.linkedlist;

/**
 * Odd Even Linked List
 * <p>
 * Given the head of a singly linked list, group all the nodes with odd indices
 * together followed by the nodes with even indices, and return the reordered list.
 * <p>
 * Constraints:
 * - The relative order of the odd and even nodes should be preserved.
 * - 0 <= Number of nodes <= 10^4
 */
public class OddEvenLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof ListNode other)) return false;
            ListNode a = this, b = other;
            while (a != null && b != null) {
                if (a.val != b.val) return false;
                a = a.next;
                b = b.next;
            }
            return a == null && b == null;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
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
