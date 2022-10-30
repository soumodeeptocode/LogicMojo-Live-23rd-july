package com.java.logicmojo.linkedlist.liveclass;

import com.java.logicmojo.linkedlist.ListNode;

public class PalindromeLL {
    static ListNode head = null;

    public static boolean isPalindrome(ListNode node){
        if(node == null || node.getNext() == null) return true;

        //Middle Element of LL//
        ListNode slow = node;
        ListNode fast = node;

        while(fast != null && fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        //reverse the second half//
        ListNode headSecondHalf = reverse(slow);

        //compare the first and second half//
        while(node != null && headSecondHalf != null){
            if(node.getData() != headSecondHalf.getData()){
                break;
            }
            node = node.getNext();
            headSecondHalf = headSecondHalf.getNext();
        }

        //revert the reverse of the second half//
        reverse(headSecondHalf);

        if(node == null || headSecondHalf == null){
            return true;
        }

        return false;
    }

    private static ListNode reverse(ListNode node){
        ListNode prev = null;
        while(node != null){
            ListNode next = node.getNext();
            node.setNext(prev);
            prev = node;
            node = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(2, 0);
        list.insert(4, 1);
        list.insert(6, 2);
        list.insert(1, 3);
        list.insert(2, 4);

        head = list.getHead();

        System.out.println(isPalindrome(head));
    }
}
