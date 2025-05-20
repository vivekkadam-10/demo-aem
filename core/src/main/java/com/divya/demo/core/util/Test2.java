package com.divya.demo.core.util;

public class Test2 {


    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val=1;
        head.next = new ListNode();
        head.next.val=2;
        head.next.next = new ListNode();
        head.next.next.val=3;
        head.next.next.next = new ListNode();
        head.next.next.next.val=4;
        //head.next.next.next.next = null;
        swap(head,null);
    }
    public static void swap(ListNode head, ListNode prev){
        ListNode start = new ListNode();
        start = head;
        while(start!=null && start.next!=null){
            ListNode temp = new ListNode();
            temp = start.next;
            start.next = temp.next;
            temp.next=start;
            if(prev!=null){
                prev.next = temp;
            }else if(prev==null){
                head=temp;
            }
            prev=temp.next;
            start=start.next;
            //System.out.println(start.val+" "+temp.val);
            //print
            temp=head;
            while(temp!=null){
                System.out.print(temp.val);
                temp=temp.next;
            }
            System.out.println();
        }

    }
}
