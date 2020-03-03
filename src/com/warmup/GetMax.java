package com.warmup;

import java.util.Arrays;

public class GetMax {

    public static void main(String args[]) {
        int[] ints = {2, 3, 4, 5};

        int max = Arrays.stream(ints)
                .max()
                .getAsInt();

        System.out.println(max);

        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max2) {
                max2 = ints[i];
            }
        }
        System.out.println(max2);
    }
}
