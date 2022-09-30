package com.java.logicmojo.bitmanipulation.liveclass;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    static List<List<Integer>> doFindSubset(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int powSize = (int) Math.pow(2,n);

        for(int i = 0; i < powSize; i++){
            List<Integer> subset = new ArrayList<>();
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) != 0){
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};

        System.out.println(doFindSubset(a));

    }
}
