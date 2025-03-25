package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CanPlaceFlowersTest {

    private final CanPlaceFlowers solution = new CanPlaceFlowers();

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 1, true),
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 2, false),
                Arguments.of(new int[]{0, 0, 1, 0, 0}, 2, true),
                Arguments.of(new int[]{0}, 1, true),
                Arguments.of(new int[]{1}, 0, true),
                Arguments.of(new int[]{1}, 1, false),
                Arguments.of(new int[]{0, 0, 0, 0, 0}, 2, true)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testCanPlaceFlowers(int[] flowerbed, int n, boolean expected) {
        assertEquals(expected, solution.canPlaceFlowers(flowerbed, n));
    }
}
