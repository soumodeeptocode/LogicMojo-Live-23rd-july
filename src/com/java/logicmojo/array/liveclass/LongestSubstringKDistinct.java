package com.java.logicmojo.array.liveclass;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {
    public static int findLength(String str, int K){
        int windowStart = 0;
        int maxLength = Integer.MIN_VALUE;
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char rightChar = str.charAt(windowEnd);
            frequencyMap.put(rightChar, frequencyMap.getOrDefault(rightChar, 0)+1);

            while(frequencyMap.size() > K){
                char leftChar = str.charAt(windowStart);
                frequencyMap.put(leftChar, frequencyMap.get(leftChar)-1);

                if(frequencyMap.get(leftChar) == 0){
                    frequencyMap.remove(leftChar);
                }
                windowStart ++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart +1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String str = "araaci";
        int K = 1;
        System.out.println("Length of the longest substring with "+K+" distict characters:: "+findLength(str, K));
    }
}

//
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        Map<Character, Integer> frequencyMap = new HashMap();
//
//        int windowStart = 0;
//        int maxLength = 0;
//
//        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++){
//            char charRight = s.charAt(windowEnd);
//
//            frequencyMap.put(charRight, frequencyMap.getOrDefault(charRight, 0)+1);
//
//            while(frequencyMap.get(charRight) > 1){
//                char charLeft = s.charAt(windowStart);
//                frequencyMap.put(charLeft, frequencyMap.get(charLeft) -1);
//                windowStart ++;
//            }
//
//            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
//        }
//        return maxLength;
//    }
//}
//
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        Map<Character, Integer> indexMap = new HashMap();
//
//        int windowStart = 0;
//        int maxLength = 0;
//
//        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++){
//            char charRight = s.charAt(windowEnd);
//
//            if(indexMap.containsKey(charRight)){
//                windowStart = Math.max(windowStart, indexMap.get(charRight)+1);
//            }
//
//            indexMap.put(charRight, windowEnd);
//            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
//        }
//        return maxLength;
//    }
//}