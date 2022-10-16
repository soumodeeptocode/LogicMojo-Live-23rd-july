package com.java.logicmojo.linkedlist.liveclass;

import com.java.logicmojo.linkedlist.ListNode;

public class LinkedList {
    private int length = 0;

    //Head Node//
    ListNode head;

    public LinkedList(){
        this.length = 0;
    }

    public synchronized ListNode getHead(){
        return this.head;
    }

    //Inserting a node at the beginning of the list//
    public synchronized void insertAtBegin(ListNode node){
        node.setNext(head);
        head = node;
        length ++;
    }

    //Inserting a node at the end//
    public synchronized void insertAtEnd(ListNode node){
        if(head == null) head = node;
        else{
            node.setNext(null);
            ListNode curr = head;
            while(curr.getNext() != null){
                    curr = curr.getNext();
            }

            curr.setNext(node);
        }
        length++;
    }

    public synchronized void insert(int data, int position){
        //
        if(position < 0){
            position = 0;
        }
        if(position > length){
            position = length;
        }

        if(head == null){
            head = new ListNode(data);
        }else if(position == 0){
            ListNode temp = new ListNode(data);
            temp.setNext(head);
            head = temp;
        }else{
            ListNode curr = head;
            for(int i = 1; i < position; i++){
                curr = curr.getNext();
            }
            ListNode newNode = new ListNode(data);
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
        }

        length++;
    }


    //Remove the head of the list//

    public synchronized ListNode removeFromBegin(){
        ListNode node = head;
        if(node != null){
            head = node.getNext();
            node.setNext(null);
        }
        length --;
        return node;
    }

    public synchronized ListNode removeFromEnd(){
        if(head == null) return null;

        ListNode curr = head, prev=null, next = head.getNext();
        if(next ==null){
            head = null;
            return curr;
        }

        while((next = curr.getNext())!= null){
            prev = curr;
            curr = next;
        }
        prev.setNext(null);
        length --;
        return curr;
    }

    //remove at a particular position//
    public synchronized void remove(int position){
        if(position < 0){
            position = 0;
        }
        if(position >= length){
            position = length;
        }

        if(head == null) return;

        if(position == 0){
            ListNode temp = head;
            head = head.getNext();
            temp.setNext(null);
        }else{
            ListNode temp = head;
            for(int i = 1; i < position; i++){
                temp = temp.getNext();
            }
            ListNode temp1 = temp.getNext().getNext();
            temp.getNext().setNext(null);
            temp.setNext(temp1);
        }
        length -=1;
    }

    //remove matched node//
    public synchronized void removeMathed(ListNode node){
        if(head == null){
            return;
        }

        if(node.equals(head)){
            ListNode temp = head;
            head = head.getNext();
            temp.setNext(null);
        }

        ListNode curr = head, temp = null;

        while((temp = curr.getNext()) != null){
            if(node.equals(temp)){
                curr.setNext(temp.getNext());
                temp.setNext(null);
                return;
            }
            curr = temp;
        }
        length --;
    }

    //string representation of LL//
    public String toString(){
        String result = "[";
        if(head == null){
            return result + "|";
        }
        result = result + head.getData();
        ListNode node = head.getNext();
        while(node != null){
            result = result+ "," + node.getData();
            node = node.getNext();
        }
        return result + "|]";
    }

    public synchronized void clearList(){
        head = null;
        length = 0;
    }

}
