package com.vishnu.leetcode75.linkedlist;

import com.vishnu.leetcode75.linkedlist.MaximumTwinSumOfLinkedList.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumTwinSumOfLinkedListTest {

    record TestCase(int[] input, int expected) {
    }

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{5, 4, 2, 1}, 6),
                new TestCase(new int[]{1, 2, 3, 4, 5, 6}, 7),
                new TestCase(new int[]{1, 100000}, 100001),
                new TestCase(new int[]{1, 2, 3, 2, 1, 2}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testPairSum(TestCase testCase) {
        MaximumTwinSumOfLinkedList solver = new MaximumTwinSumOfLinkedList();
        ListNode head = toList(testCase.input());
        int result = solver.pairSum(head);
        assertEquals(testCase.expected(), result);
    }

    private static ListNode toList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : values) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }
}
