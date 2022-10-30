package com.java.logicmojo.linkedlist.liveclass;

import com.java.logicmojo.linkedlist.ListNode;

import java.util.List;

public class ReverseLLinGroup {

    static ListNode head = null;

    private static int lengthOfLL(ListNode node){
        int length = 0;
        while(node != null){
            length++;
            node = node.getNext();
        }
        return length;
    }

    static ListNode reverseNodes(ListNode head, int k){
        if(head == null || head.getNext() == null) return head;

        int length = lengthOfLL(head);

        ListNode dummyHead = new ListNode(0);
        dummyHead.setNext(head);

        ListNode pre = dummyHead;
        ListNode curr;
        ListNode nex;

        while(length >= k){
            curr = pre.getNext();
            nex = curr.getNext();

            for(int i = 1; i < k; i++){
                curr.setNext(nex.getNext());
                nex.setNext(pre.getNext());
                pre.setNext(nex);
                nex = curr.getNext();
            }
            pre = curr;
            length -= k;
        }
        return dummyHead.getNext();
    }

    static void printLL(ListNode node){
        while(node.getNext() != null){
            System.out.print(node.getData()+"->");
            node = node.getNext();
        }
        System.out.println(node.getData());
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1, 0);
        list.insert(2, 1);
        list.insert(3, 2);
        list.insert(4, 3);
        list.insert(5, 4);
        list.insert(6, 5);
        list.insert(7, 6);
        list.insert(8, 7);

        head = list.getHead();

        printLL(head);

        ListNode newHead = reverseNodes(head, 3);

        printLL(newHead);
    }
}
