package com.java.logicmojo.array.liveclass;

public class TwoSumSorted {

    static int[] findPairUsingTwoPointer(int[] input, int targetSum){
        int p1 = 0;
        int p2 = input.length - 1;

        while(p1 < p2){
            int currentSum = input[p1] + input[p2];

            //check current sum with target sum//
            if(currentSum == targetSum){
                return new int[]{input[p1], input[p2]};
            }

            if(currentSum < targetSum){
                p1++;
            }else{
                p2--;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] pairSumBruteForce(int[] input, int targetSum){

        //iterate over the array//
        for(int i=0; i < input.length; i++){
            //iterate over i+1 to the length of the array//
            for(int j = i+1; j < input.length; j++){
                if(input[i] + input[j] == targetSum){
                    return new int[] {input[i], input[j]};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] input = {1,2,3,4,6};
        int targetSum = 11;
        //int[] result = pairSumBruteForce(input, targetSum);
        int[] result = findPairUsingTwoPointer(input, targetSum);

        for(int i= 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
