package com.java.logicmojo.stack.liveclass;

import com.java.logicmojo.linkedlist.ListNode;

public class LinkedListStack<T> {
    private int length;
    private ListNode top;

    public LinkedListStack(){
        length = 0;
        top = null;
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.setNext(top);
        top = temp;
        length ++;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty !");
        }
        int data = top.getData();
        ListNode temp = top;
        top = top.getNext();
        temp.setNext(null);
        length --;
        return data;
    }


    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty !");
        }
        return top.getData();
    }
    public boolean isEmpty(){
        return (length == 0);
    }

    public int size(){
        return length;
    }

    public String toString(){
        String result = "";
        ListNode current = top;
        while(current != null){
            result = result + current.getData() + "\n";
            current = current.getNext();
        }
        return result;
    }
}
