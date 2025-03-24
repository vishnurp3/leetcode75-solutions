package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KidsWithGreatestCandiesTest {

    private final KidsWithGreatestCandies solver = new KidsWithGreatestCandies();

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 5, 1, 3}, 3, List.of(true, true, true, false, true)),
                Arguments.of(new int[]{4, 2, 1, 1, 2}, 1, List.of(true, false, false, false, false)),
                Arguments.of(new int[]{12, 1, 12}, 10, List.of(true, false, true)),
                Arguments.of(new int[]{1}, 5, List.of(true)),
                Arguments.of(new int[]{5, 5, 5}, 0, List.of(true, true, true))
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testKidsWithCandies(int[] candies, int extraCandies, List<Boolean> expected) {
        assertEquals(expected, solver.kidsWithCandies(candies, extraCandies));
    }
}
