package com.vishnu.leetcode75.array;

/**
 * Container With Most Water
 * <p>
 * You are given an integer array height of length n. There are n vertical lines drawn such that
 * the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * <p>
 * Find two lines that together with the x-axis form a container, such that the container contains
 * the most water.
 * <p>
 * Return the maximum amount of water a container can store.
 * <p>
 * Constraints:
 * - 2 <= height.length <= 10^5
 * - 0 <= height[i] <= 10^4
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            max = Math.max(max, h * w);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
