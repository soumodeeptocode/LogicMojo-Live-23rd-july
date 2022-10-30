package com.java.logicmojo.linkedlist.liveclass;

import com.java.logicmojo.linkedlist.ListNode;

import java.util.HashSet;

public class DetectALoop {
    static ListNode head = null;

    public static boolean detectLoop(){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static boolean detectLoopUsingSet(){
        HashSet<ListNode> nodeSet = new HashSet<>();
        ListNode temp = head;

        while(temp != null){

            if(nodeSet.contains(temp)){
                return true;
            }

            nodeSet.add(temp);
            temp = temp.getNext();
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(4, 0);
        list.insert(7, 1);
        list.insert(12, 2);
        list.insert(15, 3);
        list.insert(30, 4);

        list.getHead().getNext().getNext().getNext().getNext().setNext(list.head);

        head = list.getHead();

        System.out.println(detectLoopUsingSet());
        System.out.println(detectLoop());

    }
}
