package com.java.logicmojo.queue;


/**
 * Space Complexity (for n enQueue Operations) : O(n)
 * TC of EnQueue : O(1)
 * TC of DeQueue : O(1)
 * TC of isEmpty() : O(1)
 * TC of isFull() : O(1)
 * TC of QueueSize : O(1)
 */

public class FixedSizeArrayQueue {
    //Array used to implement the queue//
    private int[] queueRep;

    private int size, front, rear;

    //Length of the array//
    private static int CAPACITY = 16; //Default Queue size//

    //Initializes the queue//
    public FixedSizeArrayQueue(){
        queueRep = new int[CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    public FixedSizeArrayQueue(int cap){
        queueRep = new int[cap];
        size = 0;
        front = 0;
        rear = 0;
        CAPACITY = cap;
    }

    //Inserts an element at the rear//
    public void enQueue(int data) throws Exception {
        if(size == CAPACITY){
            throw new Exception("Queue is full: Overflow");
        }
        size++;
        queueRep[rear] = data;
        rear = (rear+1) % CAPACITY;
    }

    //Remove the front element from the queue//
    public int deQueue() throws Exception {
        if(size == 0){
            throw new Exception("Queue is empty: Underflow");
        }
        size --;
        int data = queueRep[front];
        queueRep[front] = Integer.MIN_VALUE;
        front  = (front + 1) % CAPACITY;
        return data;
    }

    //checks whether the queue is empty//
    public boolean isEmpty(){
        return (size == 0);
    }

    public boolean isFull(){
        return (size == CAPACITY);
    }

    public int size(){
        return size;
    }

    public String toString(){
        String result = "[";
        for(int i = 0; i < size; i++){
            result += Integer.toString(queueRep[(front + 1) % CAPACITY]);
            if(i < size -1){
                result += ",";
            }
        }
        result += "]";
        return result;
    }
}
