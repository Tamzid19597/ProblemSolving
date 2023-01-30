package LinkedList;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    private class Node {
        private int value;
        private Node next;

        public Node(int value,Node next) {
            this.value = value;
            this.next=next;
        }
    }
    void insertAtFirst(int value){
        Node node=new Node(value,this.head);
        this.head=node;
        if (this.tail==null) this.tail=this.head;
        size++;
    }
    void insertAtLast(int value){
        Node node=new Node(value,null);
        if (head==null) this.head=node;
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
            System.out.println(temp.value);
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
        for (int i=1;i<index && temp!=null;i++){
            temp=temp.next;
        }
        if (temp==null) System.out.println("Index out of reach!");

        else temp.next=temp.next.next;
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
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.insertAtFirst(30);
        singlyLinkedList.insertAtLast(15);
        singlyLinkedList.insertAtPosition(20,1);
        singlyLinkedList.deleteAtPosition(5);
        singlyLinkedList.displayList();
    }
}
