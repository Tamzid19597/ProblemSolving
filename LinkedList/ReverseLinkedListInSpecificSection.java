package LinkedList;

public class ReverseLinkedListInSpecificSection {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right)return head;
        ListNode prev=null;
        ListNode present=head;
        ListNode next;
        for (int i = 0; i < left+1 && present!=null; i++) {
            prev=present;
            present=present.next;
        }
        ListNode last=prev;
        ListNode newEnd=present;
        next=present.next;
        for (int i = 0; i < right-left+1 && present!=null; i++) {
            present.next=prev;
            prev=present;
            present=next;
            if (next!=null)next=next.next;
        }
        if (last!=null)last.next=prev;
        else head=prev;
        newEnd.next=present;
        return head;
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
        display(reverseBetween(head,1,2));
    }
}
