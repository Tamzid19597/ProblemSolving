package LinkedList;

import org.w3c.dom.Node;

public class RecursiveInsertionInLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.insertAtFirst(30);
        singlyLinkedList.insertAtLast(15);
        singlyLinkedList.insertAtPosition(20,1);
        singlyLinkedList.recursiveInsertionAtPosition(10,4);
        singlyLinkedList.displayList();
    }
}
