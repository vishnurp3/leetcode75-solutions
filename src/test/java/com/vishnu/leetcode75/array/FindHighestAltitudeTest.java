package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindHighestAltitudeTest {

    record TestCase(int[] gain, int expected) {
    }

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{-5, 1, 5, 0, -7}, 1),
                new TestCase(new int[]{-4, -3, -2, -1, 4}, 0),
                new TestCase(new int[]{0, 0, 0, 0}, 0),
                new TestCase(new int[]{1, 2, 3}, 6),
                new TestCase(new int[]{-2, -1, -3}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testLargestAltitude(TestCase testCase) {
        FindHighestAltitude finder = new FindHighestAltitude();
        int result = finder.largestAltitude(testCase.gain());
        assertEquals(testCase.expected(), result);
    }
}
