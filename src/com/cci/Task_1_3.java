package com.cci;

import java.util.Arrays;

/*
 *Checks if a word is an anagram of other
 */
public class Task_1_3 {

    public static void main(String args[]) {

        Task_1_3 task_1_3 = new Task_1_3();
        System.out.println(task_1_3.isAnagramOf("dog", "god"));
        System.out.println(task_1_3.isAnagramOf("Camilo", "god"));

    }

    public boolean isAnagramOf(String source, String target) {

        if (source.length() != target.length())
            return false;

        return sort(source).equals(sort(target));
    }

    public String sort(String stg) {
        char[] characters = stg.toCharArray();
        Arrays.sort(characters);
        return new String(characters, 0, characters.length);
    }


}
