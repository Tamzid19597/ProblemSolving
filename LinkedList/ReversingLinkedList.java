package LinkedList;
//https://leetcode.com/problems/reverse-linked-list/description/
public class ReversingLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static ListNode reverseLinkedList(ListNode head){
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;
        while (present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if (next!=null)next=next.next;
        }
        return prev;
    }
    static void display(ListNode head){
        ListNode listNode=head;
        while (listNode!=null){
            System.out.print(listNode.val+"-->");
            listNode=listNode.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(3,new ListNode(1,new ListNode(4,new ListNode(7,new ListNode(6)))));
        display(head);
        display(reverseLinkedList(head));
    }
}
