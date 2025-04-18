package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubarrayOfOnesAfterDeletionTest {

    record TestCase(int[] nums, int expected) {
    }

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{1, 1, 0, 1}, 3),
                new TestCase(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}, 5),
                new TestCase(new int[]{1, 1, 1}, 2),
                new TestCase(new int[]{1, 0, 0, 0, 1}, 1),
                new TestCase(new int[]{0, 0, 0}, 0),
                new TestCase(new int[]{1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testLongestSubarray(TestCase testCase) {
        LongestSubarrayOfOnesAfterDeletion solution = new LongestSubarrayOfOnesAfterDeletion();
        assertEquals(testCase.expected(), solution.longestSubarray(testCase.nums()));
    }
}
