package com.vishnu.leetcode75.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Dota2 Senate
 * <p>
 * In the Dota2 senate, there are two parties: Radiant ('R') and Dire ('D').
 * Each senator can ban another from the opposite party.
 * The process continues in a round-robin fashion until one party remains.
 * <p>
 * The goal is to predict the winning party.
 */
public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiant = new ArrayDeque<>();
        Queue<Integer> dire = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll();
            int d = dire.poll();
            if (r < d) {
                radiant.offer(n + r);
            } else {
                dire.offer(n + d);
            }
        }
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
