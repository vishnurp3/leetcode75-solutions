package com.vishnu.leetcode75.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Unique Number of Occurrences
 * <p>
 * Given an array of integers, return true if the number of occurrences
 * of each value is unique. Otherwise, return false.
 * <p>
 * Example:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The occurrences are {1: 3, 2: 2, 3: 1}, all counts are unique.
 */
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        Set<Integer> occurrences = new HashSet<>();
        for (int num : frequencyMap.values()) {
            if (!occurrences.add(num)) {
                return false;
            }
        }
        return true;
    }
}
