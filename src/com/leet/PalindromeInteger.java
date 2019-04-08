package com.leet;

public class PalindromeInteger {

    public static void main(String[] args) {

        PalindromeInteger a = new PalindromeInteger();
        System.out.println(a.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) { return false; }

        int temp = x;
        int r = 0;

        while (temp != 0) {
            int last = temp % 10;
            r = r * 10 + last;
            temp /= 10;
        }

        return x == r;
    }
}
