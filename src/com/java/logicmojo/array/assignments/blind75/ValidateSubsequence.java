package com.java.logicmojo.array.assignments.blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> subsequence){
        int seqIdx = 0;

        for(var value: array){
            if(seqIdx == subsequence.size()){
                break;
            }

            if(subsequence.get(seqIdx).equals(value)){
                seqIdx++;
            }
        }
        return seqIdx == subsequence.size();
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5,1,22,25,6,-1,8,10));
        List<Integer> subsequence = new ArrayList<>(Arrays.asList(1,6));
        System.out.println(isValidSubsequence(arr, subsequence));
    }
}
