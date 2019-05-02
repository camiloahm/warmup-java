package com.leet;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        char[] s = new char[] {'h', 'e', 'l', 'l', 'o'};
        new ReverseString().reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
