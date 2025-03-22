package com.vishnu.leetcode75.string;

/**
 * Greatest Common Divisor of Strings
 * <p>
 * Given two strings str1 and str2, return the largest string x such that:
 * - x divides str1 (i.e., str1 is made up of x repeated some number of times)
 * - x divides str2
 */
public class GCDOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

