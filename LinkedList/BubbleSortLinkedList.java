package LinkedList;

public class BubbleSortLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static ListNode bubbleSort(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            temp=temp.next;
        }
        ListNode tail=temp;
        temp=head;
        while (temp!=null){
            ListNode pointer=head;
            while (pointer.next!=tail){
                ListNode temporary=pointer;
                if (temporary.val>=temporary.next.val){
                    int t=temporary.val;
                    temporary.val=temporary.next.val;
                    temporary.next.val=t;
                }
                pointer=pointer.next;
            }
            temp=temp.next;
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
        ListNode head=new ListNode(3,new ListNode(1,new ListNode(4,new ListNode(7,new ListNode(6)))));
        display(head);
        display(bubbleSort(head));
    }
}
