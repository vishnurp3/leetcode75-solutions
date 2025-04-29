package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EqualRowAndColumnPairsTest {

    record TestCase(int[][] grid, int expected) {
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new TestCase(new int[][]{
                        {3, 2, 1},
                        {1, 7, 6},
                        {2, 7, 7}
                }, 1)),
                Arguments.of(new TestCase(new int[][]{
                        {3, 1, 2, 2},
                        {1, 4, 4, 5},
                        {2, 4, 2, 2},
                        {2, 4, 2, 2}
                }, 3)),
                Arguments.of(new TestCase(new int[][]{
                        {1, 2},
                        {2, 1}
                }, 2)),
                Arguments.of(new TestCase(new int[][]{
                        {1, 1, 1},
                        {1, 1, 1},
                        {1, 1, 1}
                }, 9))
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testEqualPairs(TestCase testCase) {
        EqualRowAndColumnPairs solution = new EqualRowAndColumnPairs();
        assertEquals(testCase.expected(), solution.equalPairs(testCase.grid()));
    }
}
