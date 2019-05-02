package com.leet;

import java.util.HashMap;

public class ContainsDuplicateNumber {

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicateNumber().containsDuplicate(new int[] {1, 2, 3, 4}));
        System.out.println(new ContainsDuplicateNumber().containsDuplicate(new int[] {1,2,3,1}));
    }

    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> noDuplicated = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (noDuplicated.containsKey(nums[i])) {
                return true;
            } else {
                noDuplicated.put(nums[i], nums[i]);
            }
        }

        return false;

    }
}
