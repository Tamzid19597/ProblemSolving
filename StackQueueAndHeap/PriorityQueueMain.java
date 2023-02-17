package StackQueueAndHeap;

import java.util.PriorityQueue;

public class PriorityQueueMain {
    public static void main(String[] args) throws Exception{
        PriorityQueueUsingLinkedList priorityQueue=new PriorityQueueUsingLinkedList();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.display();
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());
        priorityQueue.display();
    }
}
