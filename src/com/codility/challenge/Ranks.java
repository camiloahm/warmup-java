package com.codility.challenge;

import java.util.HashMap;

public class Ranks {

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[] {3, 4, 3, 0, 2, 2, 3, 0, 0}));
        System.out.println(Solution.solution(new int[] {4, 2, 0}));
        System.out.println(Solution.solution(new int[] {4, 4, 3, 3, 1, 0}));
        System.out.println(Solution.solution(new int[] {999999999, 1000000000}));

    }

    static class Solution {

        public static int solution(int[] ranks) {
            // write your code in Java SE 8
            final HashMap<Integer, Integer> possibleRanks = new HashMap<>();

            for (int rank : ranks) {
                possibleRanks.put(rank, rank);
            }

            int soldiersThatReport = 0;

            for (int rank : ranks) {
                if (possibleRanks.containsKey(rank + 1)) {
                    soldiersThatReport++;
                }
            }

            return soldiersThatReport;
        }
    }
}
