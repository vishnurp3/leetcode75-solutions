package com.vishnu.leetcode75.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Leaf-Similar Trees
 * <p>
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * This class provides a method to determine if two trees are leaf-similar.
 */
public class LeafSimilarTrees {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        collectLeaves(root1, leaves1);
        collectLeaves(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    private void collectLeaves(TreeNode node, List<Integer> leaves) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
        }
        collectLeaves(node.left, leaves);
        collectLeaves(node.right, leaves);
    }
}
