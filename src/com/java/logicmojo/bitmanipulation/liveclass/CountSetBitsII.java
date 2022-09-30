package com.java.logicmojo.bitmanipulation.liveclass;

import java.util.Arrays;

public class CountSetBitsII {

    private static int countSetBits(int num){
        int count = 0;
        while(num > 0){
            num = num & (num-1);
            count++;
        }
        return count;
    }

    private static int[] countBits(int n){
        int[] res = new int[n+1];

        for(int i = 0; i <= n; i++){
            res[i] = countSetBits(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int range = 6;
        System.out.println(Arrays.toString(countBits(range)));

    }
}
