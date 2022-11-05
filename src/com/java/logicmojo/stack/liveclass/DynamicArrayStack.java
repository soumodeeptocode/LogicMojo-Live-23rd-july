package com.java.logicmojo.stack.liveclass;

public class DynamicArrayStack {
    //Length of the array//
    protected int capacity;
    //Default array capacity//
    public static final int CAPACITY = 16;
    //Array used to implement the stack//
    protected int[] stackRep;
    //Index of the top element//
    protected int top = -1;

    public DynamicArrayStack(){
        this(CAPACITY);
    }

    public DynamicArrayStack(int _capacity){
        capacity = _capacity;
        stackRep = new int[capacity];
    }

    //size//
    public int size(){
        return (top+1);
    }

    //isEmpty//
    public boolean isEmpty(){
        return (top < 0);
    }

    public int top() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty !");
        }
        return stackRep[top];
    }

    //pushing new data to stack//
    public void push(int data){
        if(size() == capacity){
                expand();
        }
        stackRep[++top] = data;
    }

    private void expand(){
        int length = size();
        int[] newStack = new int[length << 1];
        System.arraycopy(stackRep,0,newStack, 0, length);
        stackRep = newStack;
        this.capacity = this.capacity << 1;
    }

    //pop//
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        int data = stackRep[top];
        stackRep[top] = Integer.MIN_VALUE;
        top--;
        shrink();
        return data;
    }

    private void shrink(){
        int length = size();
        if(top << 2 >= length ) return;

        //means shrink to 1/2 or less//
        length = length + (top << 1);
        int[] newStack = new int[length];
        System.arraycopy(stackRep, 0, newStack, 0, length);
        stackRep = newStack;
        this.capacity = length;
    }
}
