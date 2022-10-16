package com.java.logicmojo.bitmanipulation.liveclass;

public class Complement {
    public static int bitwiseComplement(int num){
        //count the number of total bits in input num//
        int bitCount = 0;
        int n = num;
        while(n > 0){
            bitCount ++;
            n = n >> 1;
        }
        //all the set bits//
        int all_bits_set = (int) Math.pow(2,bitCount) -1;

        //xor of number and all set bits//
        return num ^ all_bits_set;

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(bitwiseComplement(n));
    }
}
