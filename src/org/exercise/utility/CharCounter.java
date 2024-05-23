package org.exercise.utility;

import java.util.HashMap;
import java.util.Map;

public class CharCounter {
    //Utility method that takes a string and returns a map with character counts
    public static Map<Character, Integer> countChars(String word){
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : word.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}
