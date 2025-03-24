package com.vishnu.leetcode75.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Kids With the Greatest Number of Candies
 * <p>
 * There are n kids with candies. You are given an integer array candies, where
 * each candies[i] represents the number of candies the ith kid has, and an integer extraCandies,
 * denoting the number of extra candies you have.
 * <p>
 * Return a boolean list result, where result[i] is true if, after giving the ith kid
 * all the extraCandies, they will have the greatest number of candies among all the kids.
 */
public class KidsWithGreatestCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandy = 0;
        for (int candy : candies) {
            maxCandy = Math.max(candy, maxCandy);
        }
        for (int candy : candies) {
            result.add(((candy + extraCandies) >= maxCandy));
        }
        return result;
    }
}
