package com.vishnu.leetcode75.array;

/**
 * Increasing Triplet Subsequence
 * <p>
 * Given an integer array nums, return true if there exists a triple of indices
 * (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices
 * exist, return false.
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
