package com.vishnu.leetcode75.array;

/**
 * Find the Highest Altitude
 * <p>
 * You're given an array gain[] where gain[i] is the net gain in altitude between points i and i+1.
 * You start at altitude 0. Your task is to find the highest altitude reached during the journey.
 * <p>
 * Example:
 * Input: gain = [-5, 1, 5, 0, -7]
 * Output: 1
 * Explanation: Altitudes = [0, -5, -4, 1, 1, -6] → highest is 1
 */
public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;
        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        return maxAltitude;
    }
}
