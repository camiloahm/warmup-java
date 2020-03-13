package com.codility.challenge;

import java.util.Arrays;

public class FindBug {
    public static void main(String[] args) {
        System.out.println(Solution.solution(102));
        System.out.println(Solution.solution(955));
        System.out.println(Solution.solution(1651));
    }

    static class Solution {
        public static int solution(int n) {
            int[] d = new int[30];
            int l = 0;
            int p;
            while (n > 0) {
                d[l] = n % 2;
                n /= 2;
                l++;
            }
            System.out.println(Arrays.toString(d));
            int period = l / 2;
            for (p = 1; p < period + 1; ++p) {
                int i;
                boolean ok = true;
                for (i = 0; i < l - p; ++i) {
                    if (d[i] != d[i + p]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    return p;
                }
            }
            return -1;
        }
    }

}
