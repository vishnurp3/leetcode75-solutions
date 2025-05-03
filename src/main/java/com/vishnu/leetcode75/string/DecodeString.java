package com.vishnu.leetcode75.string;

import java.util.Stack;

/**
 * Decode String
 * <p>
 * Given an encoded string, decode it by expanding patterns of the form k[encoded_string].
 * Each k is a positive integer and the encoded_string can be nested.
 */
public class DecodeString {
    public String decodeString(String s) {
        Stack<StringBuilder> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        int num = 0;
        StringBuilder current = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                numStack.push(num);
                num = 0;
                strStack.push(current);
                current = new StringBuilder();
            } else if (ch == ']') {
                StringBuilder decoded = strStack.pop();
                int times = numStack.pop();
                decoded.append(current.toString().repeat(times));
                current = decoded;
            } else {
                current.append(ch);
            }
        }
        return current.toString();
    }
}
