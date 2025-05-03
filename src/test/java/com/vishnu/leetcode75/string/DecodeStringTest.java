package com.vishnu.leetcode75.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeStringTest {

    record TestCase(String input, String expected) {
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new TestCase("3[a]2[bc]", "aaabcbc")),
                Arguments.of(new TestCase("3[a2[c]]", "accaccacc")),
                Arguments.of(new TestCase("2[abc]3[cd]ef", "abcabccdcdcdef")),
                Arguments.of(new TestCase("10[a]", "aaaaaaaaaa")),
                Arguments.of(new TestCase("3[z]2[2[y]pq4[2[jk]e1[f]]]ef", "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef"))
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testDecodeString(TestCase tc) {
        DecodeString decoder = new DecodeString();
        assertEquals(tc.expected(), decoder.decodeString(tc.input()));
    }
}
