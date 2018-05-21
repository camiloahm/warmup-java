package com.cci;

import java.util.Arrays;

/*
 *Checks if a word is an anagram of other
 */
public class Task_1_3_2 {

    public static void main(String args[]) {

        Task_1_3_2 task_1_3 = new Task_1_3_2();
        System.out.println(task_1_3.isAnagramOf("dog", "god"));
        System.out.println(task_1_3.isAnagramOf("Camilo", "god"));
        System.out.println(task_1_3.isAnagramOf("rail safety", "fairy tales"));

    }

    public boolean isAnagramOf(String source, String target) {

        char[] sChars = source.toCharArray();
        char[] tChars = target.toCharArray();
        int[] charCount = new int[256];

        for (char c : sChars) {
            charCount[c]++;
        }

        for (char c : tChars) {
            charCount[c]--;
            if (charCount[c] < 0) {
                return false;
            }
        }

        return true;
    }

}
