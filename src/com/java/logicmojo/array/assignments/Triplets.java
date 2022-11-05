package com.java.logicmojo.array.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
ArrayList = [-8, -5, -4,-3, -1,0, 2, 1, 5, 6, 8, 10]

 */

public class Triplets {


    public static List<List<Integer>> searchTriplets(int[] arr){
        //Sorting the array//
        Arrays.sort(arr);

        List<List<Integer>> triplets = new ArrayList<>();

        for(int i = 0; i < arr.length-2; i++){
            //skipping the duplicate element//
                if(i>0 && arr[i] == arr[i-1]){
                    continue;
                }

                searchPair(arr, -arr[i], i+1, triplets);
        }
        return triplets;
    }

    private static void searchPair(int[] arr, int targetSum, int left, List<List<Integer>> triplets){
        int right = arr.length -1;
        while(left < right){
            int currentSum = arr[left] + arr[right];
            if(currentSum == targetSum){
                triplets.add(Arrays.asList(-targetSum, arr[left], arr[right]));
                left++;
                right --;

                //skip same left element//
                while(left < right && arr[left] == arr[left -1]) left++;
                //skip same right element//
                while(left < right && arr[right] == arr[right + 1]) right--;
            }else if(targetSum > currentSum){
                left ++;
            } else{
                right --;
            }

        }

    }

    public static void main(String[] args) {
        System.out.println(searchTriplets(new int[]{-8, -5, -4,-3, -1,0, 2, 1, 5, 6, 8, 10}));
    }
}
