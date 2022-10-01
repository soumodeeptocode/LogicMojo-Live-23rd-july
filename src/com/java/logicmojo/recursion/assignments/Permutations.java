package com.java.logicmojo.recursion.assignments;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void permuteUtil(int index, int[] num, List<List<Integer>> res){
            //base condition//
        //num.length = 3
        //index = 2
        if(index == num.length){
            List<Integer> ds = new ArrayList<>();
            for(int i = 0; i < num.length; i++){
                ds.add(num[i]);
            }
            res.add(new ArrayList<>(ds));
            return;
        }

        //i = 2
        //index = 1
        for(int i = index; i < num.length; i++){
            swap(i,index,num);
            permuteUtil(index+1, num, res);
            //backtracking step//
            swap(i, index, num);
        }

    }

    private static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        permuteUtil(0, nums, res);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = permute(nums);
        //Perform sort on the result array//

        System.out.println("Permutations :: ");

        for(int i = 0; i < result.size(); i++){
            for(int j = 0; j < result.get(i).size(); j++){
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
