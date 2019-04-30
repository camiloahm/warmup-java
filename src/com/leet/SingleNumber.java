package com.leet;

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(new int[] {4, 1, 4, 2, 2}));
    }

    public int singleNumber(int[] nums) {

        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;

    }
}
