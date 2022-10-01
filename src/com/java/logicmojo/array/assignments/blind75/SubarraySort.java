package com.java.logicmojo.array.assignments.blind75;

public class SubarraySort {
    public static int[] subArraySort(int[] arr){
        int minOutofOrder = Integer.MAX_VALUE;
        int maxOutOfOrder = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            if(isOutofOrder(i, num, arr)){
                minOutofOrder = Math.min(minOutofOrder, num);
                maxOutOfOrder = Math.max(maxOutOfOrder, num);
            }
        }

        if(minOutofOrder == Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }

        //correct position for minimum//
        int leftIndex = 0;
        while(minOutofOrder >= arr[leftIndex]){
            leftIndex++;
        }
        //correct position for maximum//
        int rightIndex = arr.length -1;
        while(maxOutOfOrder <= arr[rightIndex]){
            rightIndex --;
        }
        return new int[]{leftIndex, rightIndex};
    }

    private static boolean isOutofOrder(int i, int num, int[] arr){
        if(i == 0){
            return num > arr[i+1];
        }
        if(i == arr.length-1){
            return num  < arr[i-1];
        }
        return num > arr[i+1] || num < arr[i-1];
    }
    public static void main(String[] args) {
            int[] arr = {1,2,8,4,5};
            int[] index = subArraySort(arr);

            for(int val : index){
                System.out.print(val + " ");
            }
    }
}
