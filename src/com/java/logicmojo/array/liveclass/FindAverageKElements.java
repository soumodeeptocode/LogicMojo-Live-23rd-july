package com.java.logicmojo.array.liveclass;

import java.util.Arrays;


public class FindAverageKElements {
    public static double[] findAveragesBySW(int arr[], int K){
        double[] result = new double[arr.length - K + 1];
        int windowStart = 0;
        double windowSum = 0;

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            windowSum += arr[windowEnd];

            if(windowEnd  >= K-1) {
                result[windowStart] = windowSum / K;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }
    public static double[] findAverages(int[]arr, int k){
        double[] result = new double[arr.length - k + 1];
        for(int i = 0; i <= arr.length - k; i++){
            double sum = 0;
            for(int j = i; j < i+k; j++){
                sum += arr[j];
            }
            result[i] = sum/k;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] input = {1,3,2,6,-1,4,1,8,2};
        double[] result = findAverages(input, 5);
        double res[] = findAveragesBySW(input, 5);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(res));

    }
}

