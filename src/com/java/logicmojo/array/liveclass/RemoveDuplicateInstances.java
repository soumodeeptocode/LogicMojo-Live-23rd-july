package com.java.logicmojo.array.liveclass;

public class RemoveDuplicateInstances {
    static int removeDuplicateInstances(int[] arr){
        //index of the next non-duplicate element//
        int nextNonDuplicate = 1;
        for(int next = 0; next < arr.length; next++){
            if(arr[nextNonDuplicate-1] !=  arr[next]){
                    arr[nextNonDuplicate] = arr[next];
                    nextNonDuplicate++;
            }
        }
        return nextNonDuplicate;
    }
    public static void main(String[] args) {
        int[] input = {2,3,3,3,6,9,9};
        System.out.println(removeDuplicateInstances(input));
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i]+" ");
        }
    }
}
