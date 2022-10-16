package com.java.logicmojo.sorting;

public class BubbleSort {
    public static void doBubbleSort(int[] arr){
        int n = arr.length;

        //loop over the array elements//
        for(int i = 0; i < n-1; i++){
            //loop to compare array elements//
            for(int j = 0; j < n-i-1; j++){
                //compare two adjacent elements//
                if(arr[j] > arr[j+1]){
                    //swap the elements//
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] input = {86,25,13,21,12};
        doBubbleSort(input);
        for(int val: input){
            System.out.print(val + " ");
        }
    }
}

//TC: O(n^2)
//SC: O(1)