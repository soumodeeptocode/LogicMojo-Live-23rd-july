package com.java.logicmojo.array.assignments;

public class LongestSequence {

    //1,0,1,1,0

    static int longestConsecutiveOnesBruteForce(int[] arr){
        int longestSeq = 0;
        for(int i = 0; i < arr.length; i++){
            int numberOfZero = 0;
            for(int j = i; j < arr.length; j++){
                if(arr[j] == 0){
                    numberOfZero++;
                }
                if(numberOfZero <= 1){
                    longestSeq = Math.max(longestSeq, j-i+1);
                }
            }
        }
        return longestSeq;
    }

    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxSeq = 0;
            int windowStart = 0;
            int numberOfZero = 0;

            for(int windowEnd = 0; windowEnd < nums.length; windowEnd++){
                if(nums[windowEnd] == 0){
                    numberOfZero ++;
                }

                //
                while(numberOfZero ==2){
                    if(nums[windowStart] == 0){
                        numberOfZero --;
                    }
                    windowStart++;
                }

                maxSeq = Math.max(maxSeq, windowEnd - windowStart + 1);
            }
            return maxSeq;
        }
    }
    public static void main(String[] args) {
        int[] input = {1,0,1,1,0};
        System.out.println("Longest Sequence of 1's :: "+longestConsecutiveOnesBruteForce(input));
    }
}
