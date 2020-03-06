package com.hackerrank;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(Solution.binaryGap(13));
    }

    static class Solution {
        public static int binaryGap(int N) {
            char[] chars = Integer.toBinaryString(N).toCharArray();
            int counter = 0;
            int max = 0;
            boolean foundInitialOne = false;

            for (char digit : chars) {
                if (digit == '0' && foundInitialOne) {
                    counter++;
                } else {
                    if (foundInitialOne) {
                        counter++;
                        max = Math.max(counter, max);
                        counter = 0;
                    } else {
                        foundInitialOne = true;
                    }
                }
            }
            return max;
        }
    }

}
