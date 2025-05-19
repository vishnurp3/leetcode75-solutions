package com.vishnu.leetcode75.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Path Sum III
 * <p>
 * Given the root of a binary tree and an integer targetSum, return the number of paths
 * where the sum of the values along the path equals targetSum.
 * <p>
 * The path does not need to start or end at the root or a leaf, but it must go downward.
 */
public class PathSumIII {

    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0L, 1);
        return dfs(root, 0, targetSum, prefixSums);
    }

    private int dfs(TreeNode node, long currentSum, int target, Map<Long, Integer> prefixSums) {
        if (node == null) {
            return 0;
        }
        currentSum += node.val;
        int count = prefixSums.getOrDefault(currentSum - target, 0);
        prefixSums.put(currentSum, prefixSums.getOrDefault(currentSum, 0) + 1);
        count += dfs(node.left, currentSum, target, prefixSums);
        count += dfs(node.right, currentSum, target, prefixSums);
        prefixSums.put(currentSum, prefixSums.get(currentSum) - 1);
        return count;
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
