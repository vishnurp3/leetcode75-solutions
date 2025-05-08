package com.vishnu.leetcode75.linkedlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddEvenLinkedListTest {

    record TestCase(int[] input, int[] expected) {
    }

    private static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 5, 2, 4}),
                new TestCase(new int[]{2, 1, 3, 5, 6, 4, 7}, new int[]{2, 3, 6, 7, 1, 5, 4}),
                new TestCase(new int[]{}, new int[]{}),
                new TestCase(new int[]{1}, new int[]{1}),
                new TestCase(new int[]{1, 2}, new int[]{1, 2})
        );
    }

    private OddEvenLinkedList.ListNode buildList(int[] values) {
        OddEvenLinkedList.ListNode dummy = new OddEvenLinkedList.ListNode(0);
        OddEvenLinkedList.ListNode current = dummy;
        for (int val : values) {
            current.next = new OddEvenLinkedList.ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testOddEvenList(TestCase testCase) {
        OddEvenLinkedList solution = new OddEvenLinkedList();
        var input = buildList(testCase.input());
        var expected = buildList(testCase.expected());
        var result = solution.oddEvenList(input);
        assertEquals(expected, result);
    }
}
