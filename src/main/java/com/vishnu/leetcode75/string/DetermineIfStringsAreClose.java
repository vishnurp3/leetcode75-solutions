package com.vishnu.leetcode75.string;

import java.util.Arrays;

/**
 * Determine if Two Strings are Close
 * <p>
 * Two strings are close if you can transform one into another by:
 * - Swapping any two characters
 * - Transforming every occurrence of one character into another
 * <p>
 * Conditions:
 * 1. Both strings must have the same set of characters.
 * 2. The frequency counts (but not the characters themselves) must match.
 */
public class DetermineIfStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1, freq2);
    }
}
