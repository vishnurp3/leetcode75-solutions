package com.vishnu.leetcode75.linkedlist;

import com.vishnu.leetcode75.linkedlist.DeleteMiddleNode.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DeleteMiddleNodeTest {

    record TestCase(int[] input, int[] expected) {
    }

    private static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{1, 3, 4, 7, 1, 2, 6}, new int[]{1, 3, 4, 1, 2, 6}),
                new TestCase(new int[]{1, 2, 3, 4}, new int[]{1, 2, 4}),
                new TestCase(new int[]{1, 2}, new int[]{1}),
                new TestCase(new int[]{1}, new int[]{}),
                new TestCase(new int[]{}, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testDeleteMiddle(TestCase tc) {
        DeleteMiddleNode solution = new DeleteMiddleNode();
        ListNode head = ListNode.fromArray(tc.input());
        ListNode result = solution.deleteMiddle(head);
        int[] resultArray = (result == null) ? new int[]{} : result.toArray();
        assertArrayEquals(tc.expected(), resultArray);
    }
}
