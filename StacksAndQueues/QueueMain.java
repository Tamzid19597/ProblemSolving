package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args)  throws Exception{
        ///Queue<Integer>queue=new LinkedList<>();
        CustomQueueUsingLinkedList que=new CustomQueueUsingLinkedList();
        que.add(1);
        que.add(2);
        que.add(3);
        que.display();
        que.remove();
        que.display();
    }
}
