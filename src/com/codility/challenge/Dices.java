package com.codility.challenge;

public class Dices {

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[] {1, 2, 3}));
        System.out.println(Solution.solution(new int[] {1, 1, 6}));
        System.out.println(Solution.solution(new int[] {1, 6, 2, 3}));
        System.out.println(Solution.solution(new int[] {6, 1, 6, 6}));
    }

    static class Solution {
        public static int solution(int[] A) {
            // write your code in Java SE 8
            int minMovements = Integer.MAX_VALUE;

            for (int i = 0; i < A.length; i++) {
                int movementsCounter = 0;
                for (int j = 0; j < A.length; j++) {
                    if (i == j || A[i] == A[j]) { continue; }

                    if ((A[i] + A[j]) == 7) {
                        movementsCounter += 2;
                    } else {
                        movementsCounter += 1;
                    }
                }
                if (movementsCounter < minMovements) {
                    minMovements = movementsCounter;
                }
            }

            return minMovements;
        }
    }

}
