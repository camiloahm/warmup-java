package com.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstUniqChar {

    public static void main(String[] args) {
        System.out.println(new FirstUniqChar().firstUniqChar("leetcode"));
    }

    public int firstUniqChar(String s) {

        char[] chars = s.toCharArray();
        List<Integer> indices = new ArrayList<>();
        HashMap<Character, Integer> indexLocation = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {

            Character character = chars[i];

            if (!indexLocation.containsKey(chars[i])) {
                indexLocation.put(character, i);
                indices.add(i);
            } else {
                indices.remove();
            }
        }

        return indices.toArray();

    }

}
