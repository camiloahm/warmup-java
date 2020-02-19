package com.daily;

import java.util.Arrays;

/**
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */

public class ProductPuzzle {

    int[] calculateProduct(int[] input) {

        if (input.length == 1) {
            return input;
        }

        int totalProduct = 1;
        for (int i = 0; i < input.length; i++) {
            totalProduct *= input[i];
        }

        int[] result = new int[input.length];
        for (int j = 0; j < result.length; j++) {
            result[j] = totalProduct / input[j];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5};
        ProductPuzzle puzzle = new ProductPuzzle();
        System.out.println(Arrays.toString(puzzle.calculateProduct(input)));

    }
}
