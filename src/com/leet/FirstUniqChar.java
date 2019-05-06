package com.leet;

public class FirstUniqChar {

    public static void main(String[] args) {
        System.out.println(new FirstUniqChar().firstUniqChar("eetcode"));
    }

    public int firstUniqChar(String s) {

        char[] c = s.toCharArray();
        int[] frequency = new int[129];

        for (int i = 0; i < c.length; i++) {
            frequency[c[i]]++;
        }

        for (int i = 0; i < c.length; i++) {
            if (frequency[c[i]] == 1) {
                return i;
            }
        }

        return -1;
    }

}
