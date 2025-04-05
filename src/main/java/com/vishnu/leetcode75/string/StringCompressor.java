package com.vishnu.leetcode75.string;

/**
 * String Compression
 * Given an array of characters, compress it in-place using the counts of repeated characters.
 * <p>
 * Example:
 * Input: ['a','a','b','b','c','c','c']
 * Output: 6, and chars becomes ['a','2','b','2','c','3']
 */
public class StringCompressor {

    public int compress(char[] chars) {
        int write = 0;
        int read = 0;
        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }
            chars[write++] = currentChar;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}