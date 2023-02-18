package Sorting;

import java.util.Arrays;

public class HeapSort {

    static void heapify(int[]arr,int N,int i){
        int largest=i;
        int left=2*i+1;
        int right=left+1;
        if (left<N && arr[left]>arr[largest])largest=left;
        if (right<N && arr[right]>arr[largest])largest=right;
        if (largest!=i){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            heapify(arr,N,largest);
        }
    }
    static void heapSort(int[]arr){
        int N=arr.length;
        for (int i = N/2-1; i >=0 ; i--) {
            heapify(arr,N,i);
        }
        for (int i = N-1; i >0 ; i--) {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }

    public static void main(String[] args) {
        int [] arr={1,5,7,6,8,2,3};
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
