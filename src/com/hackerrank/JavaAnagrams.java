package com.hackerrank;


import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String s, String t) {
        return stringWithSortedCharacters(s)
                .equals(stringWithSortedCharacters(t));
    }

    private static String stringWithSortedCharacters(String s) {
        char[] stringCharacters = s.toCharArray();
        Arrays.sort(stringCharacters);

        return String.valueOf(stringCharacters);
    }
}
