package com.java.logicmojo.array.liveclass;


import java.util.Iterator;

public class IntArray implements Iterable <Integer> {

    private static final int DEFAULT_CAP = 1;

    public int[] arr;
    public int len = 0;
    private int capacity = 0;

    //Initialize the array with a default capacity//
    public IntArray(){
        this(DEFAULT_CAP);
    }
    //Initialize the array with a certain capacity//
    public IntArray(int capacity){
        if(capacity < 0) throw new IllegalArgumentException("Illegal Capacity: "+ capacity);
        this.capacity = capacity;
        arr = new int[capacity];
    }

    //Given an array, make it dynamic//
    public IntArray(int[] array){
        if(array == null) throw new IllegalArgumentException("Array cannot be null");
        arr = java.util.Arrays.copyOf(array, array.length);
        capacity = len = array.length;
    }

    //Returns the size of the array//
    public int size(){
        return len;
    }

    //Returns true/false on whether the array is empty//
    public boolean isEmpty(){
        return len == 0;
    }

    // to get the data from a particular index//
    public int get(int index){
        return arr[index];
    }

    // to set the data at a particular index//
    public void set(int index, int elem){
        arr[index] = elem;
    }

    //Add an element to the dynamic array//
    public void add(int elem){
        if(len + 1 >= capacity){
            if(capacity == 0) capacity = 1;
            else capacity *= 2; //double the size
            arr = java.util.Arrays.copyOf(arr, capacity);
        }
        arr[len++] = elem;
    }

    //Remove an element at the apecified index int the list//
    public void removeAt(int rm_index){
        System.arraycopy(arr, rm_index+1, arr, rm_index, len-rm_index-1);
        --len;
        --capacity;
    }

    //Search and remove an element if it is found in the array//
    public boolean remove(int elem){
        for(int i = 0; i < len; i++){
            if(arr[i] == elem){
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    //reverse the contents of the array//
    public void reverse(){
        for(int i=0; i < len/2; i++){
            int tmp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = tmp;
        }
    }

    //sort the contents of the array//
    public void sort(){
        java.util.Arrays.sort(arr, 0, len);
    }

    @Override
    public java.util.Iterator<Integer> iterator(){
        return new java.util.Iterator<Integer>(){
            int index = 0;

            public boolean hasNext(){
                return index < len;
            }
            public Integer next(){
                return arr[index++];
            }

        };
    }


    //"[1, 2, 3, 4]"//
    public String toString() {
        if(len == 0) return "[]";
        else{
            StringBuilder sb = new StringBuilder(len).append("[");
            for(int i = 0; i < len - 1; i++){
                sb.append(arr[i]+", ");
            }
            return sb.append(arr[len - 1]+ "]").toString();
        }
    }

    public static void main(String[] args) {
        IntArray ar = new IntArray(50);
        ar.add(3);
        ar.add(7);
        ar.add(6);
        ar.add(-2);
        ar.set(2,10);
        ar.remove(6);
        ar.add(9);
        System.out.println(ar.toString());
        ar.sort();
        System.out.println(ar.toString());

        ar.reverse();
        System.out.println(ar.toString());

        Iterator<Integer> it = ar.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
