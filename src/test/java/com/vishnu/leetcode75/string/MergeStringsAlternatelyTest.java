package com.vishnu.leetcode75.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeStringsAlternatelyTest {

    private final MergeStringsAlternately merger = new MergeStringsAlternately();

    static Stream<org.junit.jupiter.params.provider.Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd"),
                Arguments.of("a", "b", "ab"),
                Arguments.of("a", "xyz", "axyz"),
                Arguments.of("longer", "short", "lsohnogretr"),
                Arguments.of("x", "y", "xy")
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testMerge(String word1, String word2, String expected) {
        assertEquals(expected, merger.mergeAlternately(word1, word2));
    }
}
