package com.leet;

public class ReverseInteger {

    public static void main(String[] args) {

        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(123));
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int last = x % 10;
            x /= 10;
            rev = rev * 10 + last;
        }

        return rev;
    }

}
