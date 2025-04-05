package com.vishnu.leetcode75.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompressorTest {

    private final StringCompressor compressor = new StringCompressor();

    static Stream<TestCase> provideTestCases() {
        return Stream.of(
                new TestCase(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}, 6, new char[]{'a', '2', 'b', '2', 'c', '3'}),
                new TestCase(new char[]{'a'}, 1, new char[]{'a'}),
                new TestCase(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}, 4, new char[]{'a', 'b', '1', '2'}),
                new TestCase(new char[]{'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'}, 3, new char[]{'a', '1', '1'}),
                new TestCase(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'}, 6, new char[]{'a', '3', 'b', '2', 'a', '2'}),
                new TestCase(new char[]{'a', 'b', 'c'}, 3, new char[]{'a', 'b', 'c'}),
                new TestCase(new char[]{'a', 'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c'}, 6, new char[]{'a', '4', 'b', '2', 'c', '4'})
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testCompress(TestCase testCase) {
        char[] input = testCase.input.clone();
        int resultLength = compressor.compress(input);
        assertEquals(testCase.expectedLength, resultLength);

        for (int i = 0; i < resultLength; i++) {
            assertEquals(testCase.expected[i], input[i], "Mismatch at index " + i);
        }
    }

    static class TestCase {
        char[] input;
        int expectedLength;
        char[] expected;

        TestCase(char[] input, int expectedLength, char[] expected) {
            this.input = input;
            this.expectedLength = expectedLength;
            this.expected = expected;
        }
    }
}
