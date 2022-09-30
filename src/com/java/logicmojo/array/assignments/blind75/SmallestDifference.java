package com.java.logicmojo.array.assignments.blind75;

import java.util.Arrays;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arr1, int[] arr2){

        //Array sort//
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int results[] = new int[]{arr1[0], arr2[0]};

        int fp = 0;
        int sp = 0;

        int smallestDiff = Integer.MAX_VALUE;

        while(fp < arr1.length && sp < arr2.length){
            int val_1 = arr1[fp];
            int val_2 = arr2[sp];

            int diff = Math.abs(val_1 - val_2);

            if(diff < smallestDiff){
                smallestDiff = diff;
                results = new int[]{val_1, val_2};
            }

            if(val_1 < val_2){
                fp++;
            }else{
                sp++;
            }
        }
        return results;
    }
    public static void main(String[] args) {
            int[] arr1 = {-1,5,10,20,28,3};
            int[] arr2 = {26,134,135,15,17};

            int[] result = smallestDifference(arr1, arr2);

            for(int val : result){
                System.out.print(val+ " ");
            }
    }
}
