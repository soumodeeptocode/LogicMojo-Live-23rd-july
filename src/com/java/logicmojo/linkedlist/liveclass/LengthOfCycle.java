package com.java.logicmojo.linkedlist.liveclass;

import com.java.logicmojo.linkedlist.ListNode;

public class LengthOfCycle {
    static ListNode head = null;

    public static int findCycleLength(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            //found a cycle//
            if(slow == fast){
                return calculateLength(slow);
            }
        }
        return 0;
    }

    public static int calculateLength(ListNode slow){
        ListNode current = slow;
        int cycleLength = 0;

        do{
            current = current.getNext();
            cycleLength++;
        }while(current != slow);
            return cycleLength;
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

        System.out.println("Length of the cycle :: "+ findCycleLength(head));
    }

}
