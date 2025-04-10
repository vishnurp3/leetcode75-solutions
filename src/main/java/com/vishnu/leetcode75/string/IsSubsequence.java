package com.vishnu.leetcode75.string;

/**
 * Is Subsequence
 * <p>
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == s.length();
    }
}
