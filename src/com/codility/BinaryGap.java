package com.codility;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(Solution.solution(1041));
    }

    static class Solution {
        public static int solution(int N) {

            char[] chars = Integer.toBinaryString(N).toCharArray();

            int counter = 0;
            int max = 0;

            for (char digit : chars) {
                if (digit == '0') {
                    counter++;
                } else {
                    max = Math.max(counter, max);
                    counter = 0;
                }
            }

            return max;
        }
    }

}
