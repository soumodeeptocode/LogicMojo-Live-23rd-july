package com.java.logicmojo.array.liveclass;

public class MaximumSubArraySum {
    public static int findMaxSubArraySum(int K, int[] arr){
        //variables//
        int windowStart = 0;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            //adding the next element//
            windowSum += arr[windowEnd];

            //slide the window, we dont need to slide if we have not hit the required window size//
            if(windowEnd  >= K-1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int K = 4;
        int input[] = {2,1,5,1,3,2};
        System.out.println("Maximum sum of a subarray of size "+K+" :  "+findMaxSubArraySum(K,input));
    }
}

