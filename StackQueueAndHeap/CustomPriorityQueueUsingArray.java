package StackQueueAndHeap;

public class CustomPriorityQueueUsingArray {
    private int[]data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;

    public CustomPriorityQueueUsingArray(){
        this(DEFAULT_SIZE);
    }
    public CustomPriorityQueueUsingArray(int length) {
        this.data=new int[length];
    }

    public boolean add(int val){
        if (this.isFull()){
            int [] temp=new int[this.data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            this.data=temp;
        }
        int index=-1;
        for (int i = 0; i < size; i++) {
            if (data[i]>val) index=i;
        }
        if (index==-1){
            data[size++]=val;
            return true;
        }
        for (int i = size; i >index ; i--) {
            data[i]=data[i-1];
        }
        data[index]=val;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if (this.isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=this.data[0];
        for (int i = 1; i < size; i++) {
            data[i-1]=data[i];
        }
        this.data[size--]=0;
        return removed;
    }
    public int peek()throws Exception{
        if (this.isEmpty()){
            throw new Exception("Queue is empty");
        }
        else return this.data[0];
    }
    public void display(){
        for (int i = 0; i <this.size ; i++) {
            System.out.print(this.data[i]+"<<");
        }
        System.out.println("end");
    }
    public boolean isFull(){
        return this.size>=this.data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
}
