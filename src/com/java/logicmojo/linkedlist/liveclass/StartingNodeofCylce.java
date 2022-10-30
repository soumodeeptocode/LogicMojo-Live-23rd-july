package com.java.logicmojo.linkedlist.liveclass;

import com.java.logicmojo.linkedlist.ListNode;

public class StartingNodeofCylce {
    static ListNode head = null;

    public static ListNode findCycleStart(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        int cycleLength = 0;

        while(fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            //found a cycle//
            if(slow == fast){
                cycleLength = calculateLength(slow);
                break;
            }
        }
        return findStart(head, cycleLength);
    }

    private static int calculateLength(ListNode slow){
        ListNode current = slow;
        int cycleLength = 0;

        do{
            current = current.getNext();
            cycleLength++;
        }while(current != slow);
        return cycleLength;
    }

    private static ListNode findStart(ListNode head, int cycleLength){
        ListNode pointer1 = head, pointer2 = head;

        //move pointer2 ahead by 'cycleLength' nodes//
        while(cycleLength > 0){
            pointer2 = pointer2.getNext();
            cycleLength --;
        }

        while(pointer1 != pointer2){
            pointer1 = pointer1.getNext();
            pointer2 = pointer2.getNext();
        }

        return pointer1;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1, 0);
        list.insert(2, 1);
        list.insert(3, 2);
        list.insert(4, 3);
        list.insert(5, 4);
        list.insert(6, 5);

        list.getHead().getNext().getNext().getNext().getNext().getNext().setNext(list.head.getNext().getNext());

        head = list.getHead();

        System.out.println("Starting node of the cycle :: "+findCycleStart(head).getData());
    }
}
