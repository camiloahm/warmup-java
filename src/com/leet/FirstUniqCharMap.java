package com.leet;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class FirstUniqCharMap {

    public static void main(String[] args) {
        int character = new FirstUniqCharMap().firstUniqChar("eetcode");
        System.out.println((char) character);
    }

    public int firstUniqChar(String s) {
        {
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            s.chars().boxed().sorted().collect(Collectors.toList()).forEach(
                    integer -> {
                        if (!set.add(integer)) {
                            set.remove(integer);
                        }
                    }
            );

            return set.iterator().next();
        }

    }
}