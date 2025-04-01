package com.vishnu.leetcode75.string;

import java.util.Arrays;

/**
 * Reverse Words in a String
 * <p>
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string in which the words are in the reverse order from s but still separated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words. Do not include any extra spaces.
 * <p>
 * Example:
 * Input: s = "  the sky  is blue  "
 * Output: "blue is sky the"
 */
public class ReverseWordsInString {

    public String reverseWords(String s) {
        return s.trim()
                .replaceAll("\\s+", " ")
                .lines()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .reduce((a, b) -> b + " " + a)
                .orElse("");
    }
}
