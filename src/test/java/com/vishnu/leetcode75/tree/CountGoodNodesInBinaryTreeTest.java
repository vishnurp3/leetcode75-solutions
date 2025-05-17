package com.vishnu.leetcode75.tree;

import com.vishnu.leetcode75.tree.CountGoodNodesInBinaryTree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountGoodNodesInBinaryTreeTest {

    record TestCase(TreeNode root, int expected) {
    }

    static Stream<TestCase> data() {
        return Stream.of(
                new TestCase(tree(new Integer[]{3, 1, 4, 3, null, 1, 5}), 4),
                new TestCase(tree(new Integer[]{3, 3, null, 4, 2}), 3),
                new TestCase(tree(new Integer[]{1}), 1),
                new TestCase(tree(new Integer[]{2, 2, null, 2}), 3),
                new TestCase(tree(new Integer[]{5, 4, null, 3, null, 2, null, 1}), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testGoodNodes(TestCase tc) {
        CountGoodNodesInBinaryTree sol = new CountGoodNodesInBinaryTree();
        assertEquals(tc.expected(), sol.goodNodes(tc.root()));
    }

    private static TreeNode tree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) return null;
        TreeNode[] nodes = new TreeNode[arr.length];
        nodes[0] = new TreeNode(arr[0]);
        for (int i = 1, j = 0; i < arr.length; i++) {
            if (arr[i] != null) nodes[i] = new TreeNode(arr[i]);
            while (j < i && nodes[j] == null) j++;
            if (j >= i) continue;
            if ((i & 1) == 1) nodes[j].left = nodes[i];
            else nodes[j].right = nodes[i];
            if ((i & 1) == 0) j++;
        }
        return nodes[0];
    }
}
