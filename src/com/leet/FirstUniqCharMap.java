package com.leet;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqCharMap {

    public static void main(String[] args) {
        System.out.println(new FirstUniqCharMap().firstUniqChar("leetcode"));
    }

    public int firstUniqChar(String s) {

        char[] chars = s.toCharArray();
        int time = 1;
        Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
        Map<Character,Integer> mapItem = new HashMap<Character,Integer>();
        for (int i = 0; i < chars.length; i++){
            if (map.containsKey(chars[i])){
                int val = map.get(chars[i]);
                ++val;
                map.put(chars[i],val);
            }else{
                map.put(chars[i],time);
            }
            mapItem.put(chars[i],i);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                return mapItem.get(entry.getKey());
            }
        }
        return -1;

    }

}
