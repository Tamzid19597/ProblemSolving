package LinkedList;
//https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeTwoSortedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList=new ListNode();
        if(list1!=null && list2!=null && list1.val<=list2.val ) {
            mergedList.val=list1.val;
            list1=list1.next;
        }
        else if(list2!=null){
            mergedList.val=list2.val;
            list2=list2.next;
        }
        else if(list1!=null){
            mergedList.val=list1.val;
            list1=list1.next;
        }
        else return list1;
        ListNode head=mergedList;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                mergedList.next=list1;
                list1=list1.next;
                mergedList=mergedList.next;
            }
            else{
                mergedList.next=list2;
                list2=list2.next;
                mergedList=mergedList.next;
            }
        }
        if(list1!=null){
            while(list1!=null){
                mergedList.next=list1;
                list1=list1.next;
                mergedList=mergedList.next;
            }
        }
        if(list2!=null){
            while(list2!=null){
                mergedList.next=list2;
                list2=list2.next;
                mergedList=mergedList.next;
            }
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
        ListNode list1=new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2=new ListNode(1,new ListNode(3,new ListNode(5)));
        display(list1);
        display(list2);
        display(mergeTwoLists(list1,list2));
    }
}
