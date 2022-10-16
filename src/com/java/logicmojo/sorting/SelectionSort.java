package com.java.logicmojo.sorting;

public class SelectionSort {
    public static void doSelectionSort(int[] arr){
        int n = arr.length;

        //loop to iterate over the entire array//
        for(int i= 0; i < n-1; i++){

            //set the minimumIndex equal to the first unsorted element//
            int minIndex = i;

            //iterate over the unsorted array//
            for(int j = i+1; j < n; j++){
                //help in finding the minimum element//
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //swapping the minimum element with the element at minIndex//
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] input = {86,25,13,21,12};
        doSelectionSort(input);
        for(int val: input){
            System.out.print(val + " ");
        }
    }
}

//TC: O(n^2)
//SC: O(1)
