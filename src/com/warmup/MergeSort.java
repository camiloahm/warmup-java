package com.warmup;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();
        int[] array = {3, 2, 5, 1, 6};
        System.out.println(Arrays.toString(mergeSort.order(array, new int[array.length], 0, array.length)));
    }

    public int[] order(int[] array, int[] temp, int leftStart, int rightEnd) {

        if (leftStart >= rightEnd) {
            return array;
        }
        int middle = (leftStart + rightEnd) / 2;
        order(array, temp, leftStart, middle);
        order(array, temp, middle + 1, rightEnd);
        array = merge(array, temp, leftStart, rightEnd);
        return array;
    }


    private int[] merge(int[] array, int[] temp, int leftStart, int rightEnd) {

        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);

        return array;

    }
}
