package LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;
    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next=next;
        }
    }
    void insertAtFirst(int value){
        Node node=new Node(value,null);
        node.next=this.head;
        this.head=node;
        if (this.tail==null) {
            this.tail=this.head;
            this.head.next=this.tail;
        }
        size++;
    }
    void insertAtLast(int value){
        Node node=new Node(value,null);
        if (this.head==null) this.head=node;
        this.tail.next=node;
        this.tail=node;
        this.tail.next=this.head;
    }
    void insertAtPosition(int value,int index){
        if (index==0) {
            this.insertAtFirst(value);
            return;
        }
        Node temp=this.head;
        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        if (temp==null) System.out.println("Index out of reach!");
        else {
            Node node=new Node(value,temp.next);
            temp.next=node;
            if (node.next==null) this.tail=node;
        }

    }
    void deleteAtPosition(int index){
        if (index==0) {
            this.head=this.head.next;
            return;
        }
        Node temp=this.head;
        for (int i=1;i<index && temp!=tail;i++){
            temp=temp.next;
        }
        if (temp==this.tail) System.out.println("Index out of reach!");

        else temp.next=temp.next.next;
    }
    void displayList(){
        Node temp=this.head.next;
        System.out.print(this.head.value+"==>");
        while (temp!=this.head){
            System.out.print(temp.value+"==>");
            temp=temp.next;
        }
        //System.out.print(this.tail.value+"==>");
        System.out.println("END");
    }
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList=new CircularLinkedList();
        circularLinkedList.insertAtFirst(30);
        circularLinkedList.insertAtLast(15);
        circularLinkedList.insertAtPosition(20,1);
        circularLinkedList.deleteAtPosition(2);
        circularLinkedList.displayList();
        System.out.println(circularLinkedList.tail.value);
    }
}
