package com.vishnu.leetcode75.tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfBinaryTreeTest {

    record TestCase(MaximumDepthOfBinaryTree.TreeNode root, int expected) {
    }

    static Stream<TestCase> testCases() {
        MaximumDepthOfBinaryTree.TreeNode root1 = new MaximumDepthOfBinaryTree.TreeNode(3);
        root1.left = new MaximumDepthOfBinaryTree.TreeNode(9);
        root1.right = new MaximumDepthOfBinaryTree.TreeNode(20);
        root1.right.left = new MaximumDepthOfBinaryTree.TreeNode(15);
        root1.right.right = new MaximumDepthOfBinaryTree.TreeNode(7);

        MaximumDepthOfBinaryTree.TreeNode root2 = new MaximumDepthOfBinaryTree.TreeNode(1);
        root2.right = new MaximumDepthOfBinaryTree.TreeNode(2);

        return Stream.of(
                new TestCase(root1, 3),
                new TestCase(root2, 2),
                new TestCase(null, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testMaxDepth(TestCase testCase) {
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        assertEquals(testCase.expected(), solution.maxDepth(testCase.root()));
    }
}
