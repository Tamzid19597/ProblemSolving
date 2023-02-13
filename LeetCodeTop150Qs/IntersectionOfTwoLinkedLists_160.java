package LeetCodeTop150Qs;

//https://leetcode.com/problems/intersection-of-two-linked-lists/description/
public class IntersectionOfTwoLinkedLists_160 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        while(headA!=null && headB!=null){
            if(headA==headB)return headA;
            headA=headA.next;
            headB=headB.next;
            if(headA==null && headB!=null) headA=b;
            else if(headA!=null && headB==null) headB=a;
        }
        return null;
    }
    static void display(ListNode head){
        while (head!=null){
            System.out.print(head.val+"-->");
            head=head.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        ListNode common=new ListNode(8,new ListNode(4,new ListNode(5)));
        ListNode headA=new ListNode(4,new ListNode(1,common));
        ListNode headB=new ListNode(5,new ListNode(6,new ListNode(1,common)));
        display(headA);
        display(headB);
        display(getIntersectionNode(headA,headB));
    }

}
