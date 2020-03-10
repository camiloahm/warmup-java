package com.codility;

/**
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog
 * always jumps a fixed distance, D.
 *
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 *
 * For example, given:
 *
 * X = 10
 * Y = 85
 * D = 30
 * the function should return 3, because the frog will be positioned as follows:
 *
 * after the first jump, at position 10 + 30 = 40
 * after the second jump, at position 10 + 30 + 30 = 70
 * after the third jump, at position 10 + 30 + 30 + 30 = 100
 */
public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(Solution.solution(10, 85, 30));

    }

    static class Solution {
        public static int solution(int X, int Y, int D) {
            // write your code in Java SE 8
            //x+nD>=Y
            //n>=(Y-X)/D

            int result = (int) Math.ceil(1.0 * (Y - X) / D);
            return result;

        }
    }

}
