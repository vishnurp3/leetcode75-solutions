package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueNumberOfOccurrencesTest {

    record TestCase(int[] input, boolean expected) {
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new TestCase(new int[]{1, 2, 2, 1, 1, 3}, true)),
                Arguments.of(new TestCase(new int[]{1, 2}, false)),
                Arguments.of(new TestCase(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}, true)),
                Arguments.of(new TestCase(new int[]{}, true)),
                Arguments.of(new TestCase(new int[]{5, 5, 5, 5, 5}, true)),
                Arguments.of(new TestCase(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4}, true)),
                Arguments.of(new TestCase(new int[]{1, 1, 2, 2, 3, 3, 4, 4}, false))
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testUniqueOccurrences(TestCase testCase) {
        UniqueNumberOfOccurrences solution = new UniqueNumberOfOccurrences();
        boolean actual = solution.uniqueOccurrences(testCase.input());
        assertEquals(testCase.expected(), actual);
    }
}
