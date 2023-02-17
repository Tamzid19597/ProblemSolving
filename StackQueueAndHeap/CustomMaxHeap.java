package StackQueueAndHeap;

public class CustomMaxHeap {
    private int[]data;
    private static final int DEFAULT_SIZE=10;
    private int size=1;

    public CustomMaxHeap(){
        this(DEFAULT_SIZE);
    }
    public CustomMaxHeap(int length){
        data=new int[length];
    }

    public void insert(int val){
        if (this.isFull()){
            int[]temp=new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        data[size++]=val;
        for (int i = size; i/2 >0;) {
            int parent=i/2;
            if (data[i]>data[parent]) {
                int temp=data[i];
                data[i]=data[parent];
                data[parent]=temp;
                return;
            }
            i=i/2;
        }
    }
    public int remove()throws Exception{
        if (this.isEmpty()){
            throw new Exception("Heap is empty!");
        }
        int removed=data[1];
        data[1]=data[size-1];
        data[size-1]=0;
        size--;
        for (int i = 1; i*2 <data.length;) {
            int leftChild=i*2;
            if (data[i]<data[leftChild]) {
                int temp=data[i];
                data[i]=data[leftChild];
                data[leftChild]=temp;
            }
            else if ((i*2)+1<data.length) {
                int rightChild = (i * 2) + 1;
                if (data[i] < data[rightChild]) {
                    int temp = data[i];
                    data[i] = data[rightChild];
                    data[rightChild] = temp;
                }
            }
            else break;
            i=i*2;
        }
        return removed;
    }

    public void display(){
        for (int i = 1; i < this.size; i++) {
            System.out.print(this.data[i]+" ");
            if (i!=0 && i%3==0) System.out.print(",");
        }
        System.out.println("end");

    }
    public boolean isFull(){
        return this.size>=this.data.length;
    }
    public boolean isEmpty(){
        return size==1;
    }

}
