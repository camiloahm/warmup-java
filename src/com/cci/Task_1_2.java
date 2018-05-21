package com.cci;

import java.util.Arrays;

/**
 * Reverse an Array
 * <p>
 * Example {1,2,3,4,5} should return {5,4,3,2,1}
 */
public class Task_1_2 {

    public static void main(String args[]) {

        Task_1_2 task_1_2 = new Task_1_2();
        int[] array = {6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(task_1_2.reverseArray(array)));

    }

    public int[] reverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {

            int right = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[right];
            array[right] = temp;
        }

        return array;
    }

}
