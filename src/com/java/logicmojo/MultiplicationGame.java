package com.java.logicmojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Alice is given a list nums1 of length n by Bob where n is always even.
 * She has also an empty list nums2. Bob has given her a task based on the following operations:
 *
 * Take any 2 elements of nums1 and remove them from nums1
 * Multiply those 2 elements and push the product at the end of nums2
 * Now, Alice has to perform the above operations exactly n/2 times in such a way such that the maximum value of nums2 list is minimized.
 * Create an algorithm to execute the task and return the minimum value present in nums2.
 *
 * Input Format
 *
 * First line is the length of the array
 * Next line consist of elements of the array
 *
 * Constraints
 *
 * 2 <= array.length <= 2 * 105
 * -104 <= array[i] <= 104
 *
 * Output Format
 *
 * Return the Integer value
 *
 * Sample Input 0
 *
 * 4
 * -12 17 -13 17
 * Sample Output 0
 *
 * -204
 * Explanation 0
 *
 * Iteration 1: Choose 17 and -12. Delete from nums1
 * Push in nums2 (17 * -12) = -204
 * Iteration 2: Choose 17 and -13. Delete from nums1.
 * Push in nums2 (17 * -13) = -221
 * nums2 = [-204, -221]. -204 is the maximum value of nums2.
 *
 * Sample Input 1
 *
 * 2
 * 1 -1
 * Sample Output 1
 *
 * -1
 * Explanation 1
 *
 * Array: {1*-1} = -1
 */

public class MultiplicationGame {

    public static int doMultiply(List<Integer> arr, int length){
        Collections.sort(arr);
        System.out.println(arr);
        int k = length/2;
        int res[] = new int[k];
        int index = 0;

        int i = 0, j = length -1;

        while(k > 0){
            if(arr.get(i) < 0 && arr.get(j) > 0){

                res[index++] = arr.get(i) * arr.get(j);
                i++;
                j--;
            }else if(arr.get(i) < 0 && arr.get(j) < 0){
                res[index++] = arr.get(j) * arr.get(j-1);
                j = j-2;
            }else{
                res[index++] = arr.get(i) * arr.get(i+1);
                i = i+2;
            }
            k--;
        }
        for(int x = 0; x < res.length; x++){
            System.out.print(res[x] + " ");
        }
        return res[res.length-1];
    }

    public static void main(String[] args) {
        //int arr[] = {-8,-6,-5,-1,2,4,7,8};
        //int arr[] = {1,-1};
        //int arr[] = {-8,-7,-6,-5,-2,-1,1,7};
        //int arr[] = {2,3,4,5,6,7};
        //int arr[] = {-6,-5,-4,-3,-2,-1};
        //List<Integer> arr = new ArrayList<>(Arrays.asList(-3137, -2101, 1691,-3719 ,3707 ,-3690 ,-3548 ,-1432 ,127 ,-4431 ,3099 ,-81 ,3474 ,-3344 ,-1834, 1836 ,-3040 ,-4520 ,3512 ,4292));
        List<Integer> arr = new ArrayList<>(Arrays.asList(2918, -854, 4052, 1440, 389));
        int length = arr.size();

        System.out.println(doMultiply(arr, length));
    }
}

