package StackQueueAndHeap;

public class HeapMain {
    public static void main(String[] args) throws Exception{
        CustomMaxHeap heap=new CustomMaxHeap();
        heap.insert(60);
        heap.insert(40);
        heap.insert(50);
        heap.display();
        System.out.println(heap.remove());
        heap.display();
    }
}
