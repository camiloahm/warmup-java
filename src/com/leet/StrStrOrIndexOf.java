package com.leet;

public class StrStrOrIndexOf {

    public static void main(String[] args) {
        StrStrOrIndexOf strings = new StrStrOrIndexOf();
        System.out.println(strings.strStr("hello", "ll"));
        System.out.println(strings.strStr("aaaaa", "bba"));
        System.out.println(strings.strStr("aaaaa", ""));
        System.out.println(strings.strStr("aaa", "aaaa"));
        System.out.println(strings.strStr("ma", "ma"));
        System.out.println(strings.strStr("a", "a"));
        System.out.println(strings.strStr("sissippi", "issipi"));
        System.out.println(strings.strStr("mississippi", "a"));
        System.out.println(strings.strStr("massissippi", "a"));

    }

    public int strStr(String haystack, String needle) {

        if (haystack == null || needle.length() > haystack.length()) {
            return -1;
        }

        if (needle == null || needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}
