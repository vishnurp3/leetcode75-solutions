package com.vishnu.leetcode75.string;

import java.util.Set;

/**
 * Reverse Vowels of a String
 * <p>
 * Given a string s, reverse only the vowels of the string and return it.
 * Vowels are 'a', 'e', 'i', 'o', 'u' and their uppercase versions.
 */
public class ReverseVowels {

    private static final Set<Character> VOWELS = Set.of(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
    );

    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            while (left < right && !VOWELS.contains(chars[left])) {
                left++;
            }
            while (left < right && !VOWELS.contains(chars[right])) {
                right--;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
