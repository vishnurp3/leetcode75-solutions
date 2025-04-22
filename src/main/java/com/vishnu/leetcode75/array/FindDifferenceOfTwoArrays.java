package com.vishnu.leetcode75.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Find the Difference of Two Arrays
 * <p>
 * Given two integer arrays nums1 and nums2, return a list of two lists:
 * - List 1 contains the distinct integers in nums1 not in nums2.
 * - List 2 contains the distinct integers in nums2 not in nums1.
 */
public class FindDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        Set<Integer> onlyInNums1 = new HashSet<>(set1);
        onlyInNums1.removeAll(set2);
        Set<Integer> onlyInNums2 = new HashSet<>(set2);
        onlyInNums2.removeAll(set1);
        return List.of(new ArrayList<>(onlyInNums1), new ArrayList<>(onlyInNums2));
    }
}
