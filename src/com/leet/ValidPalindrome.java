package com.leet;

public class ValidPalindrome {

    public static void main(String[] args) {

        ValidPalindrome palindrome = new ValidPalindrome();
        System.out.println(palindrome.isPalindrome("camilo"));
        System.out.println(palindrome.isPalindrome("ana"));
        System.out.println(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return cleanedString.equals(reverseString(cleanedString));
    }

    private String reverseString(final String s) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return String.valueOf(chars);
    }
}
