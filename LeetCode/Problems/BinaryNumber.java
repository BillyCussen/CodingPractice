/*
BinaryNumber.java
Billy Cussen
05/09/2020
*/

//Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
//Return the decimal value of the number in the linked list.

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class BinaryNumber{
    
    public static void main(String[] args){

        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(0,head1);
        ListNode head3 = new ListNode(1, head2);

        System.out.println(getDecimalValue(head3));
    }

    //Solution 1
    //102 / 102 test cases passed.
    //Runtime: 10 ms
    //Memory Usage: 37.7 MB
    public static int getDecimalValue(ListNode head) {
        ListNode current = head;
        String solution = new String();
        while(current!=null){
            solution += current.val;
            current = current.next;
        }
        return Integer.parseInt(solution,2);
    }


    public static int getDecimalValue1(ListNode head) {

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


