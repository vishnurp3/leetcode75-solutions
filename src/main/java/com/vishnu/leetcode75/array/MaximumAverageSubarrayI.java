package com.vishnu.leetcode75.array;

/**
 * Maximum Average Subarray I
 * <p>
 * Given an array consisting of `n` integers, find the contiguous subarray
 * of given length `k` that has the maximum average value. You need to
 * output the maximum average value.
 * <p>
 * Constraints:
 * - 1 <= k <= n <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * <p>
 * Example:
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12 + -5 + -6 + 50) / 4 = 12.75
 */

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        double currentSum = maxSum;
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum / k;
    }
}
