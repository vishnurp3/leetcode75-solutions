package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxNumberOfKSumPairsTest {

    record TestCase(int[] nums, int k, int expected) {
    }

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{1, 2, 3, 4}, 5, 2),
                new TestCase(new int[]{3, 1, 3, 4, 3}, 6, 1),
                new TestCase(new int[]{1, 2, 3, 4, 5, 6}, 7, 3),
                new TestCase(new int[]{1, 1, 1, 1}, 2, 2),
                new TestCase(new int[]{2, 2, 2, 2}, 4, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testMaxOperations(TestCase tc) {
        MaxNumberOfKSumPairs solution = new MaxNumberOfKSumPairs();
        assertEquals(tc.expected(), solution.maxOperations(tc.nums(), tc.k()));
    }
}
