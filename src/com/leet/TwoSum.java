package com.leet;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] {3, 2, 4}, 6)));
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            values.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int searchFor = target - nums[i];
            if (values.containsKey(searchFor) && values.get(searchFor) != i) {
                return new int[] {i, values.get(searchFor)};
            }
        }

        return new int[0];
    }

}

