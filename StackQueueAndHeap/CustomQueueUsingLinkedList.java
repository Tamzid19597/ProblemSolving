package StackQueueAndHeap;
public class CustomQueueUsingLinkedList{
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
        else {
            this.tail.next = new Node(val, null);
            this.tail = this.tail.next;
        }
        return true;
    }
    public int remove() throws  Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removedVal=this.head.value;
        this.head=this.head.next;
        return removedVal;
    }
    public int peek() throws  Exception{
        if (isEmpty())throw new Exception("Queue is empty");
        else return this.head.value;
    }
    public void display(){
        Node temp=this.head;
        while (temp!=tail){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println(this.tail.value);
    }

    public boolean isEmpty(){
        return head==null;
    }
}
