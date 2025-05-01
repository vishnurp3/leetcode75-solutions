package com.vishnu.leetcode75.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemovingStarsFromStringTest {

    record TestCase(String input, String expected) {
    }

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase("leet**co*de*", "lecd"),
                new TestCase("erase*****", ""),
                new TestCase("a*b*c*", ""),
                new TestCase("abc", "abc"),
                new TestCase("ab**c", "c")
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testRemoveStars(TestCase testCase) {
        RemovingStarsFromString solution = new RemovingStarsFromString();
        assertEquals(testCase.expected(), solution.removeStars(testCase.input()));
    }
}
