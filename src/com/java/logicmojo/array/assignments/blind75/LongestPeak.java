package com.java.logicmojo.array.assignments.blind75;

public class LongestPeak {
    public static int longestPeak(int[] arr){
        int longestPeak = 0;

        int i = 1;

        while(i < arr.length -1){
            boolean isPeak = arr[i-1] < arr[i] && arr[i] > arr[i+1];

            if(!isPeak){
                i+=1;
                continue;
            }

            int leftIdx = i-2;
            while (leftIdx >= 0 && arr[leftIdx] < arr[leftIdx+1]) {
                leftIdx-=1;
            }

            int rightIndex = i+2;
            while(rightIndex < arr.length && arr[rightIndex] < arr[rightIndex-1]){
                rightIndex+=1;
            }

            int currentPeakLength = rightIndex - leftIdx -1;

            if(currentPeakLength > longestPeak){
                longestPeak = currentPeakLength;
            }
            i=rightIndex;

        }
        return longestPeak;
    }

    public static void main(String[] args) {
            int arr[] = {1,2,3,3,4,0,10,6,5,-1,-3,2,3};
        System.out.println("Longest Peak Length :: "+longestPeak(arr));
    }
}
