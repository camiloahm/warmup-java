package com.codility;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Solution.solution(new int[] {1, 2, 3, 4, 5}, 3)));
    }

    static class Solution {
        public static int[] solution(int[] A, int K) {
            for (int i = 0; i < K; i++) {
                for (int j = A.length - 1; j > 0; j--) {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
            }
            return A;
        }
    }
}
