package com.vishnu.leetcode75.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * Maximum Twin Sum of a Linked List
 * <p>
 * Given the head of a linked list with even number of nodes, return the maximum twin sum.
 * A twin sum is the sum of ith node and (n - 1 - i)th node.
 */
public class MaximumTwinSumOfLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public int pairSum(ListNode head) {
        List<Integer> values = new LinkedList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        int maxSum = 0;
        int n = values.size();
        for (int i = 0; i < n / 2; i++) {
            maxSum = Math.max(maxSum, (values.get(i) + values.get(n - i - 1)));
        }
        return maxSum;
    }
}
