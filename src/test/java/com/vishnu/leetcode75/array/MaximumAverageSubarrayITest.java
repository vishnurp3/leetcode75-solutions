package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAverageSubarrayITest {

    record TestCase(int[] nums, int k, double expected) {
    }

    private static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75),
                new TestCase(new int[]{5}, 1, 5.0),
                new TestCase(new int[]{0, 4, 0, 3, 2}, 1, 4.0),
                new TestCase(new int[]{-1}, 1, -1.0),
                new TestCase(new int[]{1, 2, 3, 4, 5}, 2, 4.5)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testFindMaxAverage(TestCase tc) {
        MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();
        double actual = solution.findMaxAverage(tc.nums(), tc.k());
        assertEquals(tc.expected(), actual, 1e-5);
    }
}
