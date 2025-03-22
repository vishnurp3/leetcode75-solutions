package com.vishnu.leetcode75.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GCDOfStringsTest {

    private final GCDOfStrings solution = new GCDOfStrings();

    static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of("ABCABC", "ABC", "ABC"),
                Arguments.of("ABABAB", "ABAB", "AB"),
                Arguments.of("LEET", "CODE", ""),
                Arguments.of("AAAAAA", "AAA", "AAA"),
                Arguments.of("ABCDEF", "ABC", ""),
                Arguments.of("A", "A", "A"),
                Arguments.of("ABABABAB", "ABAB", "ABAB")
        );
    }

    @ParameterizedTest
    @MethodSource("inputProvider")
    @DisplayName("Test GCD of Strings")
    void testGCDOfStrings(String str1, String str2, String expected) {
        assertEquals(expected, solution.gcdOfStrings(str1, str2));
    }
}
