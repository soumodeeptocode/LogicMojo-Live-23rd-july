package com.java.logicmojo.array.assignments.blind75;

import java.util.Arrays;

public class NonConstructibleChange {
    public static int nonConstructibeChange(int[] coins){

        Arrays.sort(coins);
        int minChange = 0;

        for(int i = 0; i < coins.length; i++){
            if(coins[i] > minChange + 1){
                break;
            }
            minChange += coins[i];
        }
        return minChange + 1;
    }
    public static void main(String[] args) {
        int[] coins = {5,7,1,1,2,3,22};
        System.out.println(nonConstructibeChange(coins));
    }
}
