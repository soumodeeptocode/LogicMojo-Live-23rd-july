package com.java.logicmojo.array.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAnagram {
    static List<Integer> findStaringAnagrams(String s, String pattern){
        Map<Character, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int windowStart= 0, match = 0;

        //Add the pattern elements into the freq Map//
        for(char ch: pattern.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch,0) +1 );
        }

        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char rightChar = s.charAt(windowEnd);

            if(freqMap.containsKey(rightChar)){
                freqMap.put(rightChar, freqMap.get(rightChar) - 1);
                if(freqMap.get(rightChar) == 0){
                    match ++;
                }
            }

            if(match == freqMap.size()){
                result.add(windowStart);
            }

            if(windowEnd >= pattern.length()-1){
                char leftChar = s.charAt(windowStart);
                if(freqMap.containsKey(leftChar)){
                    if(freqMap.get(leftChar) == 0){
                        match --;
                    }
                    freqMap.put(leftChar, freqMap.get(leftChar)+1);
                }
               windowStart++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(findStaringAnagrams("ppqp", "pq"));
        System.out.println(findStaringAnagrams("abbcabc", "abc"));
    }
}
