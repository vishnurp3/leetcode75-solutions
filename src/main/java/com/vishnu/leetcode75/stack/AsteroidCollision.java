package com.vishnu.leetcode75.stack;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Asteroid Collision
 * <p>
 * Given a list of asteroids moving either left (-) or right (+), return the state
 * of the asteroids after all collisions have occurred. Collisions only occur when
 * a right-moving asteroid encounters a left-moving one.
 * <p>
 * Example:
 * Input: [5, 10, -5]
 * Output: [5, 10]
 */
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int a : asteroids) {
            boolean destroyed = false;
            while (!stack.isEmpty() && a < 0 && stack.peekLast() > 0) {
                int top = stack.peekLast();
                if (top < -a) {
                    stack.pollLast();
                } else if (top == -a) {
                    stack.pollLast();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                stack.addLast(a);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}
