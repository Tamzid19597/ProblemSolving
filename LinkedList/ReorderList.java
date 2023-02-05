package LinkedList;
//https://leetcode.com/problems/reorder-list/description/
public class ReorderList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static void reorderList(ListNode head) {
        if(head==null)return;
        ListNode mid=middleNode(head);
        ListNode reverse=reverseLinkedList(mid);
        ListNode reRevrse=reverse;
        ListNode temp;
        while(reverse!=null && head!=null){
            temp=head.next;
            head.next=reverse;
            head=temp;
            temp=reverse.next;
            reverse.next=head;
            reverse=temp;
        }
        if(head!=null)head.next=null;
    }
    static ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
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
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        display(head);
        reorderList(head);
        display(head);
    }
}
