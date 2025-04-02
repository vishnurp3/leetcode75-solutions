package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf solver = new ProductOfArrayExceptSelf();

    @ParameterizedTest
    @MethodSource("testCases")
    void testProductExceptSelf(int[] input, int[] expected) {
        assertArrayEquals(expected, solver.productExceptSelf(input));
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 3, 4},
                        new int[]{24, 12, 8, 6}
                ),
                Arguments.of(
                        new int[]{-1, 1, 0, -3, 3},
                        new int[]{0, 0, 9, 0, 0}
                ),
                Arguments.of(
                        new int[]{2, 3},
                        new int[]{3, 2}
                ),
                Arguments.of(
                        new int[]{1, 2, 0, 4},
                        new int[]{0, 0, 8, 0}
                ),
                Arguments.of(
                        new int[]{0, 0},
                        new int[]{0, 0}
                ),
                Arguments.of(
                        new int[]{5, 1, 10, 2},
                        new int[]{20, 100, 10, 50}
                ),
                Arguments.of(
                        new int[]{1, -1, 1, -1},
                        new int[]{1, -1, 1, -1}
                )
        );
    }
}
