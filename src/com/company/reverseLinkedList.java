package com.company;

/**
 * Created by Nikhil on 2/28/16.
 */
public class reverseLinkedList {

    public LinkNode reverseList(LinkNode head) {
        LinkNode curr = head;
        LinkNode prev = null;
        LinkNode next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
