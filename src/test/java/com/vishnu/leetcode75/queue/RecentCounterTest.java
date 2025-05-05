package com.vishnu.leetcode75.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecentCounterTest {

    record TestCase(List<Integer> inputPings, List<Integer> expectedOutputs) {
    }

    private RecentCounter counter;

    @BeforeEach
    void setup() {
        counter = new RecentCounter();
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testPing(TestCase testCase) {
        for (int i = 0; i < testCase.inputPings.size(); i++) {
            int actual = counter.ping(testCase.inputPings.get(i));
            assertEquals(testCase.expectedOutputs.get(i), actual,
                    "Mismatch at index " + i + " for ping(" + testCase.inputPings.get(i) + ")");
        }
    }

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(
                        List.of(1, 100, 3001, 3002),
                        List.of(1, 2, 3, 3)
                ),
                new TestCase(
                        List.of(100, 3100, 6200, 9300),
                        List.of(1, 2, 1, 1)
                )
        );
    }
}
