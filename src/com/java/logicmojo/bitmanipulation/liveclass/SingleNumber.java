package com.java.logicmojo.bitmanipulation.liveclass;

public class SingleNumber {

    public static int findSingleNumber(int[] arr){
        int num = 0;

        //iterate over the array and will carry out XOR with every number//

        for(int i = 0; i < arr.length; i++){
            num = num ^ arr[i];
        }
        return num;
    }

    public static void main(String[] args) {
        int[] input = {5,6,5,4,6,8,8};
        System.out.println(findSingleNumber(input));
    }
}
