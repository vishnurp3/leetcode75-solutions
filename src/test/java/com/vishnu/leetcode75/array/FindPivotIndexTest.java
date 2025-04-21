package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPivotIndexTest {

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{1, 7, 3, 6, 5, 6}, 3),
                new TestCase(new int[]{1, 2, 3}, -1),
                new TestCase(new int[]{2, 1, -1}, 0),
                new TestCase(new int[]{-1, -1, -1, -1, -1, 0}, 2),
                new TestCase(new int[]{-1, -1, 0, 1, 1, 0}, 5),
                new TestCase(new int[]{1, -1, 0}, 2),
                new TestCase(new int[]{0, 0, 0, 0, 1}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testPivotIndex(TestCase testCase) {
        FindPivotIndex solver = new FindPivotIndex();
        assertEquals(testCase.expected(), solver.pivotIndex(testCase.nums()));
    }

    record TestCase(int[] nums, int expected) {
    }
}
