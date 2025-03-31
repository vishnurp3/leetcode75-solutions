package com.vishnu.leetcode75.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseVowelsTest {

    private final ReverseVowels solution = new ReverseVowels();

    static Stream<TestCase> inputProvider() {
        return Stream.of(
                new TestCase("hello", "holle"),
                new TestCase("leetcode", "leotcede"),
                new TestCase("aA", "Aa"),
                new TestCase("bcdfg", "bcdfg"),
                new TestCase("Euston saw I was not Sue", "euston saw I was not SuE"),
                new TestCase("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("inputProvider")
    @DisplayName("Should reverse vowels correctly")
    void testReverseVowels(TestCase testCase) {
        String result = solution.reverseVowels(testCase.input());
        assertEquals(testCase.expected(), result);
    }

    record TestCase(String input, String expected) {
    }
}
