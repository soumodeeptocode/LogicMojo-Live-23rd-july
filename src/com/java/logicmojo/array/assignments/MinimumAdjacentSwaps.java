package com.java.logicmojo.array.assignments;

public class MinimumAdjacentSwaps {

    public static void nextPermutation(int[] nums) {

        int i = nums.length - 2;

        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        //if(i < 0) return -1;
        if(i >= 0){
            int j = nums.length -1;
            while(nums[j] <= nums[i]){
                j--;
            }

            //swap index i and j//
            doSwap(nums, i, j);
            doReverse(nums, i+1, nums.length - 1);
        }

    }

    private static void doSwap(int[] nums, int i, int j){
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }

    private static void doReverse(int[] nums, int start, int end){
        while(start < end){
            doSwap(nums, start, end);
            start ++;
            end --;
        }
    }

    private static int findMinAdjacentSwaps(int[] nums, int[] kBigger){
        int minSwaps = 0, i = 0, j = 0;

        while(i < nums.length){
            j=i;
            while(nums[j] != kBigger[i]){
                j++;
            }

            while(i < j){
                doSwap(nums, j-1, j);
                j--;
                minSwaps++;
            }

            i++;
        }
        return minSwaps;
    }
    public static void main(String[] args) {
        int input[] = {5,4,8,9,3,5,5,1,4,2};
        int k = 4;
        while( k > 0){
            nextPermutation(input);
            k--;
        }

//        for(int i : input){
//            System.out.print(i+" ");
//        }
        System.out.println("The minimum number of swaps :: "+findMinAdjacentSwaps(new int[]{5,4,8,9,3,5,5,1,4,2}, input));
    }
}
