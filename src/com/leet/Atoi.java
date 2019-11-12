package com.leet;

public class Atoi {

    public static void main(String[] args) {
        Atoi atoi = new Atoi();

        System.out.println(atoi.myAtoi("42"));
        System.out.println(atoi.myAtoi("   -42"));
        System.out.println(atoi.myAtoi("words and 987"));
        System.out.println(atoi.myAtoi("-91283472332"));

    }

    public int myAtoi(String str) {

        char[] chars = str.toCharArray();
        boolean isFirst = false;

        for (char c : chars) {
            if (Character.isDigit(c)) {
                isFirst = true;

            }
        }

        return 0;
    }

}
