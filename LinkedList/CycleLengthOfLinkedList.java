package LinkedList;

public class CycleLengthOfLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static int hasCycle(ListNode head) {
        int length=0;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)break;
        }
        length=length+1;
        slow=slow.next;
        while (slow!=fast){
            length++;
            slow=slow.next;
        }
        return length;
    }

    public static void main(String[] args) {
        ListNode listNodeWithCycle=new ListNode(1);
        ListNode listNode=new ListNode(2);
        listNode.next=listNodeWithCycle;
        listNodeWithCycle.next=listNode;
        System.out.println(hasCycle(listNodeWithCycle));

    }
}
