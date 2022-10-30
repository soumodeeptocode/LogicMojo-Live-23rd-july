package com.java.logicmojo.linkedlist.liveclass;

import com.java.logicmojo.linkedlist.ListNode;

public class MiddleElement {
    static ListNode head;

    public static void doFindMiddle(){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        System.out.println(slow.getData());
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 1; i <= 5; i++){
            list.insert(i*5+10, i-1);
        }
        System.out.println(list.toString());
        head = list.getHead();
        doFindMiddle();
    }
}
