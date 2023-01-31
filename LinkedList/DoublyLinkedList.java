package LinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value, Node next,Node prev) {
            this.value = value;
            this.next=next;
            this.prev=prev;
        }
    }
    void insertAtFirst(int value){
        Node node=new Node(value,this.head,null);
        if (this.head==null){
            this.head=node;
            this.tail=node;
            return;
        }
        this.head.prev=node;
        node.next=this.head;
        this.head=node;
        if (this.tail==null) this.tail=this.head;
        size++;
    }
    void insertAtLast(int value){
        Node node=new Node(value,null,this.tail);
        if (this.head==null) {
            this.tail=node;
            this.head=node;
            return;
        }
        this.tail.next=node;
        this.tail=node;
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
            Node node=new Node(value,temp.next,temp);
            temp.next.prev=node;
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
        for (int i=1;i<index && temp!=null;i++){
            temp=temp.next;
        }
        if (temp==null) System.out.println("Index out of reach!");

        else {
            temp.next.next.prev=temp;
            temp.next=temp.next.next;
        }
    }
    void displayList(){
        Node temp=this.head;
        while (temp!=null){
            System.out.print(temp.value+"==>");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        doublyLinkedList.insertAtFirst(30);
        doublyLinkedList.insertAtLast(15);
        doublyLinkedList.insertAtPosition(20,1);
        doublyLinkedList.deleteAtPosition(5);
        doublyLinkedList.displayList();
        System.out.println(doublyLinkedList.tail.prev.value);
        System.out.println(doublyLinkedList.head.next.value);
    }
}
