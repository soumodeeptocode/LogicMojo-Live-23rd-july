package com.java.logicmojo.linkedlist.liveclass;

import com.java.logicmojo.linkedlist.ListNode;

public class AddInteger {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);

        ListNode temp = dummy;

        int carry = 0;

        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;

            if(l1 != null){
                sum += l1.getData();
                l1 = l1.getNext();
            }
            if(l2 != null){
                sum += l2.getData();
                l2 = l2.getNext();
            }
            //previous carry//
            sum += carry;

            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);
            temp.setNext(node);
            temp = temp.getNext();
        }
        return dummy.getNext();
    }
}
