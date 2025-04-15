package com.vishnu.leetcode75.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxVowelsInSubstringTest {

    record TestCase(String s, int k, int expected) {
    }

    private static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase("abciiidef", 3, 3),
                new TestCase("aeiou", 2, 2),
                new TestCase("leetcode", 3, 2),
                new TestCase("rhythms", 4, 0),
                new TestCase("tryhard", 4, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testMaxVowels(TestCase tc) {
        MaxVowelsInSubstring solution = new MaxVowelsInSubstring();
        assertEquals(tc.expected(), solution.maxVowels(tc.s(), tc.k()));
    }
}
