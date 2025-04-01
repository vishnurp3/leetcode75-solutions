package com.vishnu.leetcode75.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInStringTest {

    private final ReverseWordsInString solution = new ReverseWordsInString();

    static Stream<TestCase> provideTestCases() {
        return Stream.of(
                new TestCase("the sky is blue", "blue is sky the"),
                new TestCase("  hello world  ", "world hello"),
                new TestCase("a good   example", "example good a"),
                new TestCase("  Bob    Loves  Alice   ", "Alice Loves Bob"),
                new TestCase("Alice does not even like bob", "bob like even not does Alice"),
                new TestCase("      ", ""),
                new TestCase("one", "one")
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    @DisplayName("Test Reverse Words")
    void testReverseWords(TestCase testCase) {
        assertEquals(testCase.expected(), solution.reverseWords(testCase.input()));
    }

    record TestCase(String input, String expected) {
    }
}
