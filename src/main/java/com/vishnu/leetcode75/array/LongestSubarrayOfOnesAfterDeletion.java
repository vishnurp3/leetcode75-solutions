package com.vishnu.leetcode75.array;

/**
 * Longest Subarray of 1's After Deleting One Element
 * Given a binary array nums, you should delete one element from it.
 * Return the size of the longest non-empty subarray containing only 1's in the resulting array.
 * <p>
 * Constraints:
 * - You must delete exactly one element.
 * - The array contains at least one 1.
 * <p>
 * Approach:
 * Use sliding window technique to maintain a window with at most one zero.
 * Every time zeroCount > 1, move the left pointer.
 * Track the max window size encountered.
 */
public class LongestSubarrayOfOnesAfterDeletion {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) {
                if (nums[left++] == 0) {
                    zeroCount--;
                }
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
}
