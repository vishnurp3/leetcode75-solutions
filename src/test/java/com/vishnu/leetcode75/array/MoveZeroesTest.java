package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {

    record TestCase(int[] input, int[] expected) {
    }

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
                new TestCase(new int[]{0}, new int[]{0}),
                new TestCase(new int[]{1, 2, 3}, new int[]{1, 2, 3}),
                new TestCase(new int[]{0, 0, 0, 1}, new int[]{1, 0, 0, 0}),
                new TestCase(new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0}, new int[]{4, 2, 4, 3, 5, 1, 0, 0, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testMoveZeroes(TestCase testCase) {
        MoveZeroes mover = new MoveZeroes();
        mover.moveZeroes(testCase.input());
        assertArrayEquals(testCase.expected(), testCase.input());
    }
}
