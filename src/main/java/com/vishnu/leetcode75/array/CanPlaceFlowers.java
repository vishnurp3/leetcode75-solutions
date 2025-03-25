package com.vishnu.leetcode75.array;

/**
 * Can Place Flowers
 * <p>
 * You have a long flowerbed in which some of the plots are planted and some are not.
 * However, flowers cannot be planted in adjacent plots.
 * <p>
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
 * and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
 * <p>
 * Example:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 * <p>
 * Constraints:
 * - flowerbed[i] is 0 or 1.
 * - There are no two adjacent 1s.
 * - 1 <= flowerbed.length <= 2 * 10^4
 * - 0 <= n <= flowerbed.length
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        return count >= n;
    }
}
