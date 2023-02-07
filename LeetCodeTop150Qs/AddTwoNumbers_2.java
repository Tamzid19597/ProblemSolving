package LeetCodeTop150Qs;
//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers_2 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode head=l1;
        int remainder=0;
        while(l1.next!=null && l2.next!=null){
            int temp=l1.val;
            l1.val=(l1.val+l2.val+remainder)%10;
            remainder=(temp+l2.val+remainder)/10;
            l1=l1.next;
            l2=l2.next;
        }
        int temp=l1.val;
        l1.val=(l1.val+l2.val+remainder)%10;
        remainder=(temp+l2.val+remainder)/10;
        if(l1.next==null && l2.next==null && remainder!=0){
            l1.next=new ListNode(remainder,null);
            l1=l1.next;
        }
        else if(l1.next==null){
            l1.next=l2.next;
        }
        l1=l1.next;
        while(l1!=null){
            temp=l1.val;
            l1.val=(l1.val+remainder)%10;
            remainder=(temp+remainder)/10;
            if(l1.next==null && remainder!=0){
                l1.next=new ListNode(remainder,null);
                l1=l1.next;
            }
            l1=l1.next;
        }
        return head;
    }
    static void display(ListNode head){
        while (head!=null){
            System.out.print(head.val+"-->");
            head=head.next;
        }
        System.out.println("end");
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode head2=new ListNode(5,new ListNode(6,new ListNode(4)));
        display(head);
        display(head2);
        display(addTwoNumbers(head,head2));
    }
}
