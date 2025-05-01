package com.vishnu.leetcode75.stack;

import java.util.ArrayDeque;

/**
 * Removing Stars From a String
 * <p>
 * Given a string s containing letters and '*' characters, remove the closest non-star
 * character to the left of each '*' and the '*' itself, and return the final string.
 */
public class RemovingStarsFromString {
    public String removeStars(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (Character character : s.toCharArray()) {
            if (character == '*') {
                stack.pollLast();
            } else {
                stack.offerLast(character);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character character : stack) {
            result.append(character);
        }
        return result.toString();
    }
}
