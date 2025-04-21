package com.vishnu.leetcode75.array;

/**
 * Find Pivot Index
 * <p>
 * Given an array of integers nums, calculate the pivot index:
 * An index where the sum of the numbers to the left is equal to the sum of the numbers to the right.
 * Return the left-most pivot index if found, otherwise -1.
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
