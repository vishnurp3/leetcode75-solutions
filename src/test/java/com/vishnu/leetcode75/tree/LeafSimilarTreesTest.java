package com.vishnu.leetcode75.tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeafSimilarTreesTest {

    record TestCase(LeafSimilarTrees.TreeNode root1,
                    LeafSimilarTrees.TreeNode root2,
                    boolean expected) {
    }

    private static Stream<TestCase> testCases() {
        LeafSimilarTrees.TreeNode t1 = new LeafSimilarTrees.TreeNode(3,
                new LeafSimilarTrees.TreeNode(5,
                        new LeafSimilarTrees.TreeNode(6),
                        new LeafSimilarTrees.TreeNode(2,
                                new LeafSimilarTrees.TreeNode(7),
                                new LeafSimilarTrees.TreeNode(4)
                        )
                ),
                new LeafSimilarTrees.TreeNode(1,
                        new LeafSimilarTrees.TreeNode(9),
                        new LeafSimilarTrees.TreeNode(8)
                )
        );

        LeafSimilarTrees.TreeNode t2 = new LeafSimilarTrees.TreeNode(3,
                new LeafSimilarTrees.TreeNode(5,
                        new LeafSimilarTrees.TreeNode(6),
                        new LeafSimilarTrees.TreeNode(7)
                ),
                new LeafSimilarTrees.TreeNode(1,
                        new LeafSimilarTrees.TreeNode(4),
                        new LeafSimilarTrees.TreeNode(2,
                                new LeafSimilarTrees.TreeNode(9),
                                new LeafSimilarTrees.TreeNode(8)
                        )
                )
        );

        LeafSimilarTrees.TreeNode t3 = new LeafSimilarTrees.TreeNode(1);
        LeafSimilarTrees.TreeNode t4 = new LeafSimilarTrees.TreeNode(2);

        return Stream.of(
                new TestCase(t1, t2, true),
                new TestCase(t3, t4, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testLeafSimilar(TestCase testCase) {
        LeafSimilarTrees solution = new LeafSimilarTrees();
        assertEquals(testCase.expected(), solution.leafSimilar(testCase.root1(), testCase.root2()));
    }
}
