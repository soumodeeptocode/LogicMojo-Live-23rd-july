package com.java.logicmojo.recursion.liveclass;

import java.util.ArrayList;
import java.util.*;

public class RecursionPattern {

    /* Most important pattern of Recursion */
    static int doCountAll(int index, int curr_sum, int target_sum, int[] input, int n){
        //base condition//
        if(n == index){
            if(curr_sum == target_sum){
                return 1;
            }else{
                return 0;
            }
        }

        //Pick//
        curr_sum += input[index];
        int pick = doCountAll(index+1, curr_sum, target_sum, input, n);

        // backtracking to previous state //
        curr_sum -= input[index];

        //Not Pick//
        int notPick = doCountAll(index+1, curr_sum, target_sum, input, n);

        return pick + notPick;
    }

    static boolean doPrintAnyOneSubsets(int index, int curr_sum, int target_sum, int[] input, int n, List<Integer> ds){
        //base condition//
        if(n == index){
            if(curr_sum == target_sum){
                for(int i = 0; i < ds.size(); i++){
                    System.out.print(ds.get(i)+ " ");
                }
                return true;
            }else{
                return false;
            }
        }

        //Pick//
        curr_sum += input[index];
        ds.add(input[index]);
        if(doPrintAnyOneSubsets(index+1, curr_sum, target_sum, input, n, ds)){
            return true;
        }
        // backtracking to previous state //
        curr_sum -= input[index];
        ds.remove(ds.size()-1);

        //Not Pick//
        if(doPrintAnyOneSubsets(index+1, curr_sum, target_sum, input, n, ds)){
            return true;
        }

        return false;
    }

    static void doPrintAllSubsets(int index, int curr_sum, int target_sum, int[] input, int n, List<Integer> ds){
        //base condition//
        if(n == index){
            if(curr_sum == target_sum){
                System.out.println();
                for(int i = 0; i < ds.size(); i++){
                    System.out.print(ds.get(i)+ " ");
                }
            }
            return;
        }

        //Pick//
        curr_sum += input[index];
        ds.add(input[index]);
        doPrintAllSubsets(index+1, curr_sum, target_sum, input, n, ds);

        // backtracking to previous state //
        curr_sum -= input[index];
        ds.remove(ds.size()-1);

        //Not Pick//
        doPrintAllSubsets(index+1, curr_sum, target_sum, input, n, ds);
    }

    public static void main(String[] args) {
        List<Integer> ds = new ArrayList<>();
        int[] input = {1,2,1};
        int n = input.length;
        int sum = 1;
        int curr_sum = 0;

        //doPrintAllSubsets(0, curr_sum, sum, input, n, ds);

        //Print one//
        // boolean doPrintAnySub = doPrintAnyOneSubsets(0, curr_sum, sum, input, n, ds);
        // System.out.println(doPrintAnySub);

        //Count All Subsequences//
        int count = doCountAll(0, curr_sum, sum, input, n);
        System.out.println(count);
    }
}


