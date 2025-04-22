package com.vishnu.leetcode75.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FindDifferenceOfTwoArraysTest {

    static Stream<TestCase> provideTestCases() {
        return Stream.of(
                new TestCase(
                        new int[]{1, 2, 3},
                        new int[]{2, 4, 6},
                        List.of(List.of(1, 3), List.of(4, 6))
                ),
                new TestCase(
                        new int[]{1, 2, 3, 3},
                        new int[]{1, 1, 2, 2},
                        List.of(List.of(3), List.of())
                ),
                new TestCase(
                        new int[]{4, 5},
                        new int[]{4, 5},
                        List.of(List.of(), List.of())
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testFindDifference(TestCase testCase) {
        FindDifferenceOfTwoArrays solution = new FindDifferenceOfTwoArrays();
        List<List<Integer>> result = solution.findDifference(testCase.nums1(), testCase.nums2());

        assertTrue(
                containsSameElements(result.get(0), testCase.expected().get(0)) &&
                        containsSameElements(result.get(1), testCase.expected().get(1))
        );
    }

    private boolean containsSameElements(List<Integer> actual, List<Integer> expected) {
        return actual.size() == expected.size() && actual.containsAll(expected);
    }

    record TestCase(int[] nums1, int[] nums2, List<List<Integer>> expected) {
    }
}
