package com.leet;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        RemoveDuplicates duplicates = new RemoveDuplicates();
        int[] nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(duplicates.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }

    public int removeDuplicates(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!hashSet.contains(nums[i])) {
                hashSet.add(nums[i]);
                nums[counter] = nums[i];
                counter++;
            }

        }

        return counter;
    }

}
