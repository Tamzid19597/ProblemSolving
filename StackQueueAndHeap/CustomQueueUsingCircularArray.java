package StackQueueAndHeap;

public class CustomQueueUsingCircularArray {
    private int[]data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;
    private int start=0;
    private int end=0;

    public CustomQueueUsingCircularArray(){
        this(DEFAULT_SIZE);
    }
    public CustomQueueUsingCircularArray(int length) {
        this.data=new int[length];
    }

    public boolean add(int val){
        if (this.isFull()){
            int [] temp=new int[this.data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[(i+this.start)%data.length];
            }
            this.start=0;
            this.end=this.data.length;
            this.data=temp;
        }
        this.data[size++]=val;
        end=(end+1)%data.length;
        return true;
    }
    public int remove() throws Exception{
        if (this.isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=this.data[start];
        start=(start+1)%data.length;
        return removed;
    }
    public int peek()throws Exception{
        if (this.isEmpty()){
            throw new Exception("Queue is empty");
        }
        else return this.data[start];
    }
    public void display(){
        int i=start;
        while (i!=end){
            System.out.print(data[i]+"<<");
            i=(i+1)%data.length;
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
