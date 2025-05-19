package com.vishnu.leetcode75.tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathSumIIITest {

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new Integer[]{10, 5, -3, 3, 2, null, 11, 3, -2, null, 1}, 8, 3),
                Arguments.of(new Integer[]{1, null, 2, null, 3, null, 4, null, 5}, 3, 2),
                Arguments.of(new Integer[]{1, -2, -3, 1, 3, -2, null, -1}, -1, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testPathSum(Integer[] treeArray, int targetSum, int expected) {
        PathSumIII solver = new PathSumIII();
        PathSumIII.TreeNode root = TreeBuilder.buildTree(treeArray);
        assertEquals(expected, solver.pathSum(root, targetSum));
    }

    static class TreeBuilder {
        static PathSumIII.TreeNode buildTree(Integer[] values) {
            if (values == null || values.length == 0) return null;

            PathSumIII.TreeNode[] nodes = new PathSumIII.TreeNode[values.length];
            for (int i = 0; i < values.length; i++) {
                if (null != values[i] && values[i] != Integer.MIN_VALUE) {
                    nodes[i] = new PathSumIII.TreeNode(values[i]);
                }
            }

            for (int i = 0, j = 1; j < values.length; i++) {
                if (nodes[i] != null) {
                    if (j < values.length) nodes[i].left = nodes[j++];
                    if (j < values.length) nodes[i].right = nodes[j++];
                }
            }

            return nodes[0];
        }
    }
}
