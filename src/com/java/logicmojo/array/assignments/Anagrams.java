package com.java.logicmojo.array.assignments;

import java.util.*;

/*

 I/p  = = [“cat”, “dog”, “tac”, “god”, “act”, “abc”, “cab”]

o/p =  [[‘cat’,’act’, ‘tac’], [‘dog’,’god’], [‘def’, ‘fed’]]

 */

/*
NKlogK
*/

/*
['lump', 'eat', 'me', 'tea', 'em', 'plum']
 */

public class Anagrams {

    public static List<List<String>> groupAnagram(String[] arr){
        if(arr.length == 0) return new ArrayList<>();

        Map<String, List> res = new HashMap<String, List>();

        for(String s: arr){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String s1 = String.valueOf(c);
            if(!res.containsKey(s1)) res.put(s1, new ArrayList());
            res.get(s1).add(s);
        }
        return new ArrayList(res.values());
    }

    public static void main(String[] args) {
        String[] input = {"lump", "eat", "me", "tea", "em", "plum"};

        List<List<String>> result = groupAnagram(input);

        for(int i = 0; i < result.size(); i++){
            for(int j = 0; j < result.get(i).size(); j++){
                System.out.println(result.get(i).get(j));
            }
        }
    }

}
