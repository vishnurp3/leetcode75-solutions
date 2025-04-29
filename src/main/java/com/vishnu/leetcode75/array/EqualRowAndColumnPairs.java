package com.vishnu.leetcode75.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Equal Row and Column Pairs
 * <p>
 * Given a 2D integer matrix `grid`, return the number of pairs (Ri, Cj)
 * such that row Ri and column Cj are equal.
 * <p>
 * A row and column are considered equal if they contain the same elements
 * in the same order.
 */
public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();
        int count = 0;
        for (int[] row : grid) {
            String key = Arrays.toString(row);
            rowMap.put(key, rowMap.getOrDefault(key, 0) + 1);
        }
        for (int column = 0; column < n; column++) {
            int[] columnArray = new int[n];
            for (int row = 0; row < n; row++) {
                columnArray[row] = grid[row][column];
            }
            String key = Arrays.toString(columnArray);
            count += rowMap.getOrDefault(key, 0);
        }
        return count;
    }
}
