package com.leet;

public class FirstUniqChar {

    public static void main(String[] args) {
        System.out.println(new FirstUniqChar().firstUniqChar("leetcode"));
    }

    public int firstUniqChar(String s) {

        char[] chars = s.toCharArray();
        int[] frequency = new int[129];

        for (int i = 0; i < chars.length; i++) {
            frequency[chars[i]]++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (frequency[i] == 1) {
                return i;
            }
        }

        return -1;
    }

}
