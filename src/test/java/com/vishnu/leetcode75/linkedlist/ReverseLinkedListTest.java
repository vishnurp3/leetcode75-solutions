package com.vishnu.leetcode75.linkedlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseLinkedListTest {

    record TestCase(ReverseLinkedList.ListNode input, int[] expected) {
    }

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(createList(1, 2, 3, 4, 5), new int[]{5, 4, 3, 2, 1}),
                new TestCase(createList(), new int[]{}),
                new TestCase(createList(1), new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testReverseList(TestCase testCase) {
        ReverseLinkedList solution = new ReverseLinkedList();
        ReverseLinkedList.ListNode result = solution.reverseList(testCase.input);
        assertArrayEquals(testCase.expected, toArray(result));
    }

    private static ReverseLinkedList.ListNode createList(int... values) {
        ReverseLinkedList.ListNode dummy = new ReverseLinkedList.ListNode(0);
        ReverseLinkedList.ListNode current = dummy;
        for (int val : values) {
            current.next = new ReverseLinkedList.ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    private static int[] toArray(ReverseLinkedList.ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        return values.stream().mapToInt(i -> i).toArray();
    }
}
