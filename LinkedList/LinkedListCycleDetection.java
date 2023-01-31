package LinkedList;

public class LinkedListCycleDetection {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode listNodeWithCycle=new ListNode(1);
        ListNode listNode=new ListNode(2);
        ListNode listNodeWithoutCycle=new ListNode(1,new ListNode(2));
        listNode.next=listNodeWithCycle;
        listNodeWithCycle.next=listNode;
        System.out.println(hasCycle(listNodeWithCycle));
        System.out.println(hasCycle(listNodeWithoutCycle));
    }

}
