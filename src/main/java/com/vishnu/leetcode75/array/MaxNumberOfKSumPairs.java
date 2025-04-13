package com.vishnu.leetcode75.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Max Number of K-Sum Pairs
 * <p>
 * Given an integer array nums and an integer k, return the maximum number of operations
 * you can perform on the array where in each operation you remove two elements whose sum is k.
 * <p>
 * Example:
 * Input: nums = [1,2,3,4], k = 5
 * Output: 2
 */
public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int operations = 0;
        for (int num : nums) {
            int complement = k - num;
            if (countMap.getOrDefault(complement, 0) > 0) {
                operations++;
                countMap.put(complement, countMap.get(complement) - 1);
            } else {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }
        return operations;
    }
}
