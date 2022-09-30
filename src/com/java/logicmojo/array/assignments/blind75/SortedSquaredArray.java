package com.java.logicmojo.array.assignments.blind75;

public class SortedSquaredArray {
    public static int[] sortedSquaredArray(int[] arr){
        int out[] = new int[arr.length];
        int counter = arr.length -1;

        int firstIdx = 0;
        int lastIndex = arr.length -1;

        for(int i = 0; i < arr.length; i++){
            if(Math.abs(arr[firstIdx]) > Math.abs(arr[lastIndex])){
                out[counter - i] = arr[firstIdx] * arr[firstIdx];
                firstIdx++;
            }else{
                out[counter -i] = arr[lastIndex] * arr[lastIndex];
                lastIndex--;
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int arr[] = {-10,2,3,5,6,8,9};
        int[] result = sortedSquaredArray(arr);

        for(int value: result){
            System.out.print(value + " ");
        }

    }
}
