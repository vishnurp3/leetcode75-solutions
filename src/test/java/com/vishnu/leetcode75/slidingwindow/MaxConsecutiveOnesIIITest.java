package com.vishnu.leetcode75.slidingwindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxConsecutiveOnesIIITest {

    record TestCase(int[] nums, int k, int expected) {
    }

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2, 6),
                new TestCase(new int[]{0, 0, 1, 1, 1, 0, 0}, 0, 3),
                new TestCase(new int[]{1, 1, 1, 1}, 0, 4),
                new TestCase(new int[]{0, 0, 0, 1}, 4, 4),
                new TestCase(new int[]{1, 0, 1, 0, 1}, 1, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testLongestOnes(TestCase testCase) {
        MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();
        int result = solution.longestOnes(testCase.nums(), testCase.k());
        assertEquals(testCase.expected(), result);
    }
}
