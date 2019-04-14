package com.leet;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        RemoveDuplicates duplicates = new RemoveDuplicates();
        int[] nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(duplicates.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }

    public int removeDuplicates(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        int r = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (i + 1 < nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            } else {
                r++;
            }
        }

        return r;
    }

}
