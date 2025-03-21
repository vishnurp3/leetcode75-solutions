package com.vishnu.leetcode75.string;

/**
 * Merge Strings Alternately
 * <p>
 * Given two strings word1 and word2, merge them by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the remaining letters at the end.
 * <p>
 * Example:
 * word1 = "abc", word2 = "pqr" → "apbqcr"
 * word1 = "ab", word2 = "pqrs" → "apbqrs"
 */
public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int m = word1.length();
        int n = word2.length();
        StringBuilder sb = new StringBuilder(m + n);
        while (i < m || i < n) {
            if (i < m) {
                sb.append(word1.charAt(i));
            }
            if (i < n) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
