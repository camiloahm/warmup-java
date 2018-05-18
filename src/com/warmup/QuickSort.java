package com.warmup;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();
        int[] array = {3, 2, 5, 1, 6};
        System.out.println(Arrays.toString(quickSort.order(array)));
    }

    public int[] order(int[] array) {

        return applyQuickSort(array, 0, array.length - 1);
    }

    private int[] applyQuickSort(int[] array, int left, int right) {

        if (left >= right) {
            return array;
        }

        int pivot = array[(left + right) / 2];
        int index = findPartition(array, left, right, pivot);

        applyQuickSort(array, left, index - 1);
        applyQuickSort(array, index, right);


        return array;
    }

    private int findPartition(int[] array, int left, int right, int pivot) {

        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }


        return left;
    }

    private void swap(int[] array, int left, int right) {

        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }


}

