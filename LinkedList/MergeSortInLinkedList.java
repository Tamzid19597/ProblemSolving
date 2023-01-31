package LinkedList;

public class MergeSortInLinkedList {
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
    static ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode midPrev=new ListNode();
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            if (fast==null)midPrev=slow;
            slow=slow.next;
        }
        midPrev.next=null;
        return slow;
    }
    static ListNode mergeSort(ListNode head){
        if (head==null || head.next==null)return head;
        ListNode mid=middleNode(head);
        ListNode temp=head;
        while (temp.next!=null&& temp.next!=mid){
            temp=temp.next;
        }
        temp.next=null;
        ListNode left=mergeSort(head);
        ListNode right=mergeSort(mid);
        return mergeTwoLists(left,right);
    }
    static void display(ListNode head){
        while (head!=null){
            System.out.print(head.val+"-->");
            head=head.next;
        }
        System.out.println("end");
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(3,new ListNode(1,new ListNode(4,new ListNode(7,new ListNode(6)))));
        display(head);
        display(mergeSort(head));
    }
}
