package com.leet;

public class FindTownJudge {

    public static void main(String[] args) {


    }

    public int findJudge(int n, int[][] trust) {
        int[] trustScores = new int[n + 1];  // Array to track trust scores

        // Process each trust relationship
        for (int[] relation : trust) {
            int personA = relation[0];  // person who trusts
            int personB = relation[1];  // person who is trusted

            trustScores[personA]--;  // personA trusts someone (decrement their score)
            trustScores[personB]++;  // personB is trusted (increment their score)
        }

        // Find the person who has n-1 incoming trust scores and 0 outgoing trust scores
        for (int person = 1; person <= n; person++) {
            if (trustScores[person] == n - 1) {
                return person;  // Return the town judge
            }
        }

        return -1;  // No judge found
    }
}
