package com.company;

/**
 * Created by Nikhil on 2/28/16.
 */
public class mergePointLinkedList {

    public LinkNode getIntersectionNode(LinkNode headA, LinkNode headB) {

        if (headA != null && headB != null) {
            LinkNode curr1 = headA;
            LinkNode curr2 = headB;
            int c1 = 1;
            int c2 = 1;
            while (curr1.next != null) {
                c1++;
                curr1 = curr1.next;
            }

            while (curr2.next != null) {
                c2++;
                curr2 = curr2.next;
            }

            if (curr1.val != curr2.val) {
                return null;
            } else {

                curr1 = headA;
                curr2 = headB;


                if (c1 > c2) {
                    while (c1 != c2) {
                        curr1 = curr1.next;
                        c1--;
                    }

                }
                if (c1 < c2) {
                    while (c1 != c2) {
                        curr2 = curr2.next;
                        c2--;
                    }
                }

                while (curr1 != null && curr2 != null) {
                    if (curr1.val == curr2.val)
                        return curr1;

                    curr1 = curr1.next;
                    curr2 = curr2.next;
                }

                return null;
            }
        } else
            return null;


    }
}
