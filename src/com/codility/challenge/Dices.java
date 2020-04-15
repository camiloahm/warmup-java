package com.codility.challenge;

/**
 * input array contains the number on the face up.
 * Calculate the total number of min rotations of, to make all fac.. the same.
 * 1 will require only one rotation to have 2, 3, 4 and 5 face up,
 * but would require min two rotations to make it the face 6, as 6 is the opposite side of 1.
 * The opposite side of 2 is 5 and 3 is 4.
 */
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
