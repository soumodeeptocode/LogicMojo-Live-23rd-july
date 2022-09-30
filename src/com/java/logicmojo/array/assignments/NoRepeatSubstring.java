package com.java.logicmojo.array.assignments;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {
    static int findLength(String str, int K){
        int windowStart = 0, maxLength = 0, maxRepeatLetterCount = 0;
        Map<Character, Integer> freqMap = new HashMap<>();

        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char rightChar = str.charAt(windowEnd);
            freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);

            maxRepeatLetterCount = Math.max(maxRepeatLetterCount, freqMap.get(rightChar));

            if(windowEnd-windowStart+1 - maxRepeatLetterCount > K){
                char leftChar = str.charAt(windowStart);
                freqMap.put(leftChar, freqMap.get(leftChar) -1 );
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart +1);

        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(findLength("aabccbb", 2));
    }
}
