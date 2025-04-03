package com.vishnu.leetcode75.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncreasingTripletSubsequenceTest {

    private final IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();

    static Stream<TestCase> provideTestCases() {
        return Stream.of(
                new TestCase(new int[]{1, 2, 3, 4, 5}, true),
                new TestCase(new int[]{5, 4, 3, 2, 1}, false),
                new TestCase(new int[]{2, 1, 5, 0, 4, 6}, true),
                new TestCase(new int[]{20, 100, 10, 12, 5, 13}, true),
                new TestCase(new int[]{1, 1, 1, 1, 1}, false),
                new TestCase(new int[]{1, 2}, false),
                new TestCase(new int[]{2, 4, -2, -3}, false)
        );
    }

    @ParameterizedTest(name = "Test {index} => input={0}")
    @MethodSource("provideTestCases")
    @DisplayName("Test Increasing Triplet Subsequence")
    void testIncreasingTriplet(TestCase testCase) {
        boolean result = solution.increasingTriplet(testCase.nums());
        assertEquals(testCase.expected(), result);
    }

    record TestCase(int[] nums, boolean expected) {
    }
}
