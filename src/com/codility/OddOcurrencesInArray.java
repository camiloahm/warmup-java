package com.codility;

import java.util.Arrays;

public class OddOcurrencesInArray {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int odd[] = {9, 3, 9, 3, 9, 7, 9};

        System.out.println(solution.solution1(odd));
        System.out.println(solution.solution2(odd));

    }

    static class Solution {

        public int solution1(int[] odd) {

            final int counter[] = new int[1000000];

            for (int i = 0; i < odd.length; i++) {
                counter[odd[i]]++;
            }

            for (int i = 0; i < counter.length; i++) {
                if (counter[i] != 0 && counter[i] % 2 != 0) {
                    return i;
                }
            }

            return Integer.MAX_VALUE;
        }

        public int solution2(int[] odd) {

            Arrays.sort(odd);

            for (int i = 0; i < odd.length - 2; i += 2) {
                if (odd[i] - odd[i + 1] < 0) {
                    return odd[i];
                }
            }

            return 0;
        }

    }
}
