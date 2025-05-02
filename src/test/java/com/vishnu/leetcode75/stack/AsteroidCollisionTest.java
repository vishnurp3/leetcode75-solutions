package com.vishnu.leetcode75.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AsteroidCollisionTest {

    record TestCase(int[] input, int[] expected) {
    }

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{5, 10, -5}, new int[]{5, 10}),
                new TestCase(new int[]{8, -8}, new int[]{}),
                new TestCase(new int[]{10, 2, -5}, new int[]{10}),
                new TestCase(new int[]{-2, -1, 1, 2}, new int[]{-2, -1, 1, 2}),
                new TestCase(new int[]{1, -2, -2, -2}, new int[]{-2, -2, -2}),
                new TestCase(new int[]{-2, -2, 1, -2}, new int[]{-2, -2, -2})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testAsteroidCollision(TestCase testCase) {
        AsteroidCollision solution = new AsteroidCollision();
        assertArrayEquals(testCase.expected(), solution.asteroidCollision(testCase.input()));
    }
}
