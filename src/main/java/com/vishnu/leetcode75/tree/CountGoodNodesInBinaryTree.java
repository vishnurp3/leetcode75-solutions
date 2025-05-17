package com.vishnu.leetcode75.tree;

/**
 * Count Good Nodes in Binary Tree
 * <p>
 * Given a binary tree, a node X in the tree is named a **good node** if in the path from root to X
 * there are no nodes with a value greater than X.
 * <p>
 * Return the number of good nodes in the binary tree.
 * <p>
 * Example:
 * Input: [3,1,4,3,null,1,5]
 * Output: 4
 * <p>
 * Definition for a binary tree node:
 */
public class CountGoodNodesInBinaryTree {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode node, int maxSoFar) {
        if (node == null) {
            return 0;
        }
        int count = node.val >= maxSoFar ? 1 : 0;
        int newMax = Math.max(node.val, maxSoFar);
        count += dfs(node.left, newMax);
        count += dfs(node.right, newMax);
        return count;
    }
}
