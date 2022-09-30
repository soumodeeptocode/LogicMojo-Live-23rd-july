package com.java.logicmojo.array.assignments.blind75;

import java.util.*;


public class MoveElement {
    public static List<Integer> movelementToEnd(List<Integer> arr, int toMove){
        int fp = 0;
        int lp = arr.size()-1;

        while(fp < lp){
            while(fp < lp && arr.get(lp) == toMove) lp--;

            if(arr.get(fp) == toMove) swap(fp,lp, arr);
            fp++;
        }
        return arr;
    }

    private static void swap(int i, int j, List<Integer> arr){
        int temp = arr.get(j);
        arr.set(j, arr.get(i));
        arr.set(i, temp);
    }
    public static void main(String[] args) {
            List<Integer> input = new ArrayList<>(Arrays.asList(2,1,2,2,2,3,4,2));
            int toMove = 2;
        System.out.println(movelementToEnd(input, toMove));
    }
}
