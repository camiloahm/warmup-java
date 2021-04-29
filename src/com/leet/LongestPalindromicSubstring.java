package com.leet;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("babad"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("cbbd"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("a"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("ac"));
    }

    public String longestPalindrome(String s) {
        String result = "";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            String temp = "";
            int j = i;
            while (j < chars.length) {
                temp += chars[j];
                if (reverseWord(temp).equals(temp)) {
                    if (result.length() < temp.length()) {
                        result = temp;
                    }
                }
                j++;
            }
        }

        return result;
    }

    public String reverseWord(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - i - 1] = temp;
        }
        return String.valueOf(chars);
    }

}
