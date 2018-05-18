package com.warmup;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {3, 2, 5, 1, 6};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.order(array)));

    }


    public int[] order(int[] array) {

        boolean isSorted = false;
        int lastSorted = array.length - 1;

        while (!isSorted) {

            isSorted = true;

            for (int i = 0; i < lastSorted - 1; i++) {
                if (array[i] > array[i + 1]) {
                    array = swap(array, i, i + 1);
                    isSorted = false;
                }
            }

            lastSorted--;
        }

        return array;
    }

    public int[] swap(int[] array, int oldPosition, int newPosition) {
        int temp = array[oldPosition];
        array[oldPosition] = array[newPosition];
        array[newPosition] = temp;
        return array;
    }


}
