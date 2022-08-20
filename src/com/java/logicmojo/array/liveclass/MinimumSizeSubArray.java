package com.java.logicmojo.array.liveclass;

public class MinimumSizeSubArray {
    public static int findMinSubArray(int S, int[] arr){
        int lengthOfSmallestSubArray = Integer.MAX_VALUE;
        int windowSum = 0;
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            windowSum += arr[windowEnd];

            while(windowSum >= S){
                lengthOfSmallestSubArray = Math.min(lengthOfSmallestSubArray, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return lengthOfSmallestSubArray;
    }
    public static void main(String[] args) {
          int result = findMinSubArray(7, new int[]{2,1,5,2,3,2});
        System.out.println("Smallest subarray length: "+result);
    }
}
