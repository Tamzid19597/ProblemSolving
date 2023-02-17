package StackQueueAndHeap;
public class CustomPriorityQueUsingMaxHeap extends CustomMaxHeap {
    public boolean add(int val){
        super.insert(val);
        return true;
    }
    public int peek()throws Exception{
        int peekVal=super.remove();
        super.insert(peekVal);
        return peekVal;
    }
    public int poll() throws Exception{
        return super.remove();
    }
}
