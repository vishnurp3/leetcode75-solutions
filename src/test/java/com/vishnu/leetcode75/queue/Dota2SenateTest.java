package com.vishnu.leetcode75.queue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Dota2SenateTest {

    record TestCase(String senate, String expected) {
    }

    private static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase("RD", "Radiant"),
                new TestCase("DDRRR", "Dire"),
                new TestCase("DRRDRDRDRDDRDRDR", "Radiant"),
                new TestCase("RRDDD", "Radiant"),
                new TestCase("RDDRDR", "Dire")
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testPredictPartyVictory(TestCase testCase) {
        Dota2Senate solution = new Dota2Senate();
        assertEquals(testCase.expected(), solution.predictPartyVictory(testCase.senate()));
    }
}
