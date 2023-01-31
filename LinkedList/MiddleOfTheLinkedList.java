package LinkedList;
//https://leetcode.com/problems/middle-of-the-linked-list/description/
public class MiddleOfTheLinkedList{
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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

    public static void main(String[] args) {
        ListNode head=new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6,new ListNode(7)))));
        System.out.println(middleNode(head).val);
    }
}
