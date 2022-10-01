package com.java.logicmojo.recursion.assignments;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {

    public static String getPermutation(int n, int k){
        int fact = 1;
        String s = "";
        k = k-1;
        List<Integer> num = new ArrayList<>();

        for(int i = 1; i < n; i++){
            fact = fact * i;
            num.add(i);
        }
        num.add(n);

        while(true){
            s = s + "" + num.get(k/fact);
            num.remove(k/fact);

            if(num.size() == 0){
                break;
            }

            k = k % fact;
            fact = fact / num.size();
        }

        return s;
    }
    public static void main(String[] args) {
        int n = 4, k = 17;
        System.out.println(getPermutation(n,17));
    }
}
