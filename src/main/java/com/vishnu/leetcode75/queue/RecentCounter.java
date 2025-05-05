package com.vishnu.leetcode75.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Number of Recent Calls
 * <p>
 * Implements a counter to track how many calls occurred in the past 3000 milliseconds.
 * Uses a queue to maintain timestamps of valid calls.
 */
public class RecentCounter {

    private final Queue<Integer> queue;

    public RecentCounter() {
        this.queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() != null && queue.peek() < (t - 3000)) {
            queue.poll();
        }
        return queue.size();
    }
}
