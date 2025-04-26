package com.vishnu.leetcode75.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetermineIfStringsAreCloseTest {

    record TestCase(String word1, String word2, boolean expected) {
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new TestCase("abc", "bca", true)),
                Arguments.of(new TestCase("a", "aa", false)),
                Arguments.of(new TestCase("cabbba", "abbccc", true)),
                Arguments.of(new TestCase("cabbba", "aabbss", false)),
                Arguments.of(new TestCase("uau", "ssx", false))
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testCloseStrings(TestCase testCase) {
        DetermineIfStringsAreClose solution = new DetermineIfStringsAreClose();
        boolean actual = solution.closeStrings(testCase.word1, testCase.word2);
        assertEquals(testCase.expected, actual);
    }
}
