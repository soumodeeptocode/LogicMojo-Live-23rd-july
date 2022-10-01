package com.java.logicmojo.array.assignments.blind75;

public class FirstDuplicate {

    public static int firstDuplicate(int[] arr){
        for(int val: arr){
            int absValue = Math.abs(val);
            if(arr[absValue -1] < 0) return absValue;
            arr[absValue-1] *= -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,2,3,3,4};
        System.out.println(firstDuplicate(arr));
    }
}
