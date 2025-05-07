package com.vishnu.leetcode75.linkedlist;

/**
 * Delete the Middle Node of a Linked List
 * <p>
 * Given the head of a singly linked list, delete the middle node.
 * If the list has only one node, return null.
 * The middle is defined as floor(n / 2) based on 0-indexing.
 */
public class DeleteMiddleNode {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public static ListNode fromArray(int[] values) {
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;
            for (int val : values) {
                current.next = new ListNode(val);
                current = current.next;
            }
            return dummy.next;
        }

        public int[] toArray() {
            int length = 0;
            ListNode temp = this;
            while (temp != null) {
                length++;
                temp = temp.next;
            }
            int[] result = new int[length];
            temp = this;
            for (int i = 0; i < length; i++) {
                result[i] = temp.val;
                temp = temp.next;
            }
            return result;
        }
    }


    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        if (prev != null) {
            prev.next = slow.next;
        }
        return head;
    }
}


