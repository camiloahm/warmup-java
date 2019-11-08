package com.leet;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("rat", "car"));
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));

    }

    public boolean isAnagram(String s, String t) {
        return stringWithSortedCharacters(s)
                .equals(stringWithSortedCharacters(t));
    }

    private String stringWithSortedCharacters(String s) {
        char[] stringCharacters = s.toCharArray();
        Arrays.sort(stringCharacters);

        return String.valueOf(stringCharacters);
    }
}
