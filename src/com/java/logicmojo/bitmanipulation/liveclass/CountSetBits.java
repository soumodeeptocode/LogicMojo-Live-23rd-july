package com.java.logicmojo.bitmanipulation.liveclass;

public class CountSetBits {

    private static int doCountSetBits(int n){
        int countSetBits = 0;
        while(n > 0){
//            if((n&1) == 1){
//                countSetBits++;
//            }
            countSetBits = countSetBits + (n & 1);
            //n /= 2;
            n = n >> 1;
        }
        return countSetBits;
    }

    private static int doCountBits(int n){
        int count = 0;

        while(n > 0){
            n = n & (n-1);
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        int number = 125;
        System.out.println("SetBits count is :: "+doCountBits(number));
    }
}
