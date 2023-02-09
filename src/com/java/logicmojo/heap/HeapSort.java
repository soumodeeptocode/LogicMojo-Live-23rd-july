package com.java.logicmojo.heap;

import java.util.PriorityQueue;

public class HeapSort {

    public static void heapSort(int[] arr){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i < arr.length; i++){
            minHeap.add(arr[i]);
        }

        for(int i = arr.length-1; i >= 0; i--){
            arr[i] = minHeap.poll();
        }

    }
    public static void main(String[] args) {
        int[] arr = {8,9,2,6,4,7,1,10,12};

        heapSort(arr);

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
