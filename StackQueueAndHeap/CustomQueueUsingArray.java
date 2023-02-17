package StackQueueAndHeap;

public class CustomQueueUsingArray {
    private int[]data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;

    public CustomQueueUsingArray(){
        this(DEFAULT_SIZE);
    }
    public CustomQueueUsingArray(int length) {
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
        this.data[size++]=val;
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
