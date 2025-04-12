package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {

    record TestCase(int[] height, int expected) {
    }

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                new TestCase(new int[]{1, 1}, 1),
                new TestCase(new int[]{4, 3, 2, 1, 4}, 16),
                new TestCase(new int[]{1, 2, 1}, 2),
                new TestCase(new int[]{2, 3, 4, 5, 18, 17, 6}, 17)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testMaxArea(TestCase tc) {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        assertEquals(tc.expected(), solution.maxArea(tc.height()));
    }
}
