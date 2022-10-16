package com.java.logicmojo.bitmanipulation.liveclass;

public class TwoSingleNumber {

    public static int[] findTwoSingleNumbers(int[] arr){
        //get the XOR of all the numbers//
        int xor = 0;
        for(int num : arr){
            xor ^= num;
        }

        //get the rightmost bit that is set '1'//
        int rightMostSetBit = 1;
        while((rightMostSetBit & xor) == 0){
            rightMostSetBit = rightMostSetBit << 1;
        }

        int num1 = 0, num2 = 0;

        for(int num : arr){
            if((num & rightMostSetBit) != 0){
                num1 = num1 ^ num;
            }else{
                num2 = num2 ^ num;
            }
        }
        return new int[]{num1,num2};
    }

    public static void main(String[] args) {
        int[] input = {5,6,5,4,6,8,9,8};
        int[] result = findTwoSingleNumbers(input);

        for(int val: result){
            System.out.print(val + " ");
        }
    }
}
