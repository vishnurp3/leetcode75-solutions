package com.vishnu.leetcode75.string;

/**
 * Maximum Number of Vowels in a Substring of Given Length
 * <p>
 * Given a string s and an integer k, return the maximum number of vowel letters
 * in any substring of s with length k.
 */
public class MaxVowelsInSubstring {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int currentCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }
            if (i >= k && isVowel(s.charAt(i - k))) {
                currentCount--;
            }
            maxVowels = Math.max(maxVowels, currentCount);
        }
        return maxVowels;
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) >= 0;
    }
}
