package com.java.logicmojo.linkedlist.liveclass;

import com.java.logicmojo.linkedlist.ListNode;

public class RotateByK {

    public ListNode rotateRight(ListNode head, int k){
        //edge case//
        if(head == null || head.getNext() == null || k == 0) return head;

        //finding the length//
        ListNode curr = head;
        int len = 1;
        while(curr.getNext() != null){
            len++;
            curr = curr.getNext();
        }

        curr.setNext(head);
        k = k % len;
        k = len - k;

        while(k-- > 0) curr = curr.getNext();
        head = curr.getNext();
        curr.setNext(null);

        return head;
    }
}
