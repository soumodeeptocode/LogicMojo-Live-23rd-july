package com.java.logicmojo.stack.liveclass;

public class FixedSizeArrayStack {
    //Length of the array used to implement the stack//
    protected int capacity;
    //Default array capacity//
    public static final int CAPACITY = 10;
    //Array used to implement stack//
    protected int[] stackRep;
    //Index of the top element of the stack in the array//
    protected int top = -1;
    //Initialize the stack to use an array of default length//
    public FixedSizeArrayStack(){
        this(CAPACITY);
    }
    public FixedSizeArrayStack(int cap){
        capacity = cap;
        stackRep = new int[capacity];
    }

    public int size(){
        return (top+1);
    }

    public boolean isEmpty(){
        return (top < 0);
    }

    public boolean isfull(){
        return (capacity == size());
    }

    //Inspects the element at the top of the stack//
    public int top() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return stackRep[top];
    }

    //Inserts an element at the top of the stack//
    public void push(int data) throws Exception {
        if(size() == capacity){
            throw new Exception("Stack is full.");
        }
        stackRep[++top] = data;
    }
    //Remove the top element from the stack//
    public int pop() throws Exception {
        int data;
        if(isEmpty()){
            throw new Exception("Stack is empty.");
        }
        data = stackRep[top];
        stackRep[top] = Integer.MIN_VALUE;
        top--;
        return data;
    }

    public String toString() {
        String s;
        s = "[";
        if(size() > 0){
            s += stackRep[0];
        }
        if(size() > 1){
            for(int i = 1; i <= size() -1; i++){
                s += "," + stackRep[i];
            }
        }
        return s + "]";
    }

}
