package com.java.logicmojo.queue;

import com.java.logicmojo.linkedlist.ListNode;
import com.java.logicmojo.stack.liveclass.LinkedListStack;

public class LinkedListQueue {
    private int length;
    private ListNode front, rear;

    public LinkedListQueue(){
        length = 0;
        front = rear = null;
    }

    public void enQueue(int data){
        ListNode node = new ListNode(data);
        if(isEmpty()){
            front = node;
        }else{
            rear.setNext(node);
        }
        rear = node;
        length++;
    }

    public int deQueue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty: Underflow");
        }

        int data = front.getData();
        front = front.getNext();
        length --;
        if(isEmpty()){
            rear = null;
        }
        return data;
    }

    public int first() throws Exception{
        if(isEmpty()) throw new Exception("Queue is empty");
        return front.getData();
    }

    public int size(){
        return length;
    }

    private boolean isEmpty(){
        return (length == 0);
    }

    //String Representation//
    public String toString(){
        String result = "";
        ListNode current = front;
        while(current != null){
            result = result + current.getData() + "\n";
            current = current.getNext();
        }
        return result;
    }

    public void reverseQueue() throws Exception {
        LinkedListStack stack = new LinkedListStack();

        //DeQueue all the elements from the queue and push it into the stack//
        while(!isEmpty()){
            stack.push(deQueue());
        }

        while(!stack.isEmpty()){
            enQueue(stack.pop());
        }
    }
}
