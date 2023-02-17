package StackQueueAndHeap;

public class PriorityQueueUsingLinkedList{
    private Node head;
    private Node tail;
    private int size=0;
    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next=next;
        }
    }

    public boolean add(int val){
        if (isEmpty()){
            this.head=new Node(val,null);
            this.tail=this.head;
        }
        else if (val<=head.value){
            Node node=new Node(val,this.head);
            this.head=node;
        }
        else if (val>=this.tail.value){
            this.tail.next=new Node(val,null);
            this.tail=this.tail.next;
        }
        else {
            Node temp=head;
            Node prev=temp;
            while (val<temp.value){
                prev=temp;
                temp=temp.next;
            }
            prev.next=new Node(val,temp);
        }
        size++;
        return true;
    }
    public int remove() throws  Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removedVal=this.head.value;
        this.head=this.head.next;
        size--;
        return removedVal;
    }
    public int peek() throws  Exception{
        if (isEmpty())throw new Exception("Queue is empty");
        else return this.head.value;
    }
    public void display(){
        Node temp=this.head;
        for (int i = 0; i < size-1; i++) {
            System.out.print(temp.value+">>");
            temp=temp.next;
        }
        System.out.println(this.tail.value);
    }

    public boolean isEmpty(){
        return head==null;
    }
}
