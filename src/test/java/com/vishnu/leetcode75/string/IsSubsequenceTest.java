package com.vishnu.leetcode75.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsSubsequenceTest {

    record TestCase(String s, String t, boolean expected) {
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new TestCase("abc", "ahbgdc", true)),
                Arguments.of(new TestCase("axc", "ahbgdc", false)),
                Arguments.of(new TestCase("", "ahbgdc", true)),
                Arguments.of(new TestCase("abc", "", false)),
                Arguments.of(new TestCase("abc", "abc", true)),
                Arguments.of(new TestCase("ace", "abcde", true)),
                Arguments.of(new TestCase("aec", "abcde", false))
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testIsSubsequence(TestCase testCase) {
        IsSubsequence solution = new IsSubsequence();
        boolean actual = solution.isSubsequence(testCase.s(), testCase.t());
        assertEquals(testCase.expected(), actual);
    }
}
