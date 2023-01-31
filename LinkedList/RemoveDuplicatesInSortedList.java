package LinkedList;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/888645089/
public class RemoveDuplicatesInSortedList {
      static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
      static ListNode deleteDuplicates(ListNode head) {
          ListNode temp=head;
          while(temp!=null && temp.next!=null){
              if(temp.val==temp.next.val){
                  temp.next=temp.next.next;
              }
              else temp=temp.next;
          }
          if(head!=null && head.next!=null && head.val==head.next.val) head.next=null;
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
            ListNode head=new ListNode(1,new ListNode(1,new ListNode(2)));
            display(head);
            head=deleteDuplicates(head);
            display(head);
      }
}
