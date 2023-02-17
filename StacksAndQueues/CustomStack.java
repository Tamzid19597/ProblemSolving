package StacksAndQueues;

public class CustomStack {
    private int[]data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int length) {
        this.data=new int[length];
    }
    public boolean push(int val){
        if (this.isFull()){
            int [] temp=new int[this.data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            this.data=temp;
        }
        this.data[this.size++]=val;
        return true;
    }
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("CustomStack is empty");
        }
        int poppedVal=data[this.size-1];
        data[this.size--]=0;
        return poppedVal;
    }
    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("CustomStack is empty");
        }
        return this.data[this.size-1];
    }
    public void display(){
        for (int i = 0; i <this.size ; i++) {
            System.out.print(this.data[i]+"<<");
        }
        System.out.println("end");
    }
    public int size(){
        return this.size;
    }
    public boolean isFull(){
        return this.size>=this.data.length;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
}
