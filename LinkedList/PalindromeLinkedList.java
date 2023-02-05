package LinkedList;

public class PalindromeLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static boolean isPalindrome(ListNode head) {
        if(head==null)return true;
        ListNode mid=middleNode(head);
        ListNode reverse=reverseLinkedList(mid);
        ListNode reRevrse=reverse;
        while(reverse!=null && head!=null){
            if(reverse.val!=head.val)return false;
            reverse=reverse.next;
            head=head.next;
        }
        return true;
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
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(1,new ListNode(2,new ListNode(1)))));
        display(head);
        System.out.println(isPalindrome(head));
        head=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        display(head);
        System.out.println(isPalindrome(head));
    }
}
