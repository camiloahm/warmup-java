package com.codility;

import java.util.Arrays;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(Solution.solution(1041));
    }

    static class Solution {
        public static int solution(int N) {

            char[] chars = Integer.toBinaryString(N).toCharArray();

            short counter = 0;
            short max = 0;

            for (char digit : chars) {
                if (digit == '0') {
                    counter++;
                } else {
                    if (counter > max) {
                        max = counter;
                    }

                    counter = 0;
                }
            }

            return max;
        }
    }

}
