package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
         int[]arr={2,4,5,1,2};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    static int[] bubbleSort(int [] arr){
        return bubbleSortHelper(arr,0,arr.length-1);
    }
    static int [] bubbleSortHelper(int []arr,int start,int end){
        if (end<0)return arr;
        if (start<end){
            if (arr[start]>arr[start+1]){
                int temp=arr[start];
                arr[start]=arr[start+1];
                arr[start+1]=temp;
            }
            return bubbleSortHelper(arr,start+1,end);
        }
        return bubbleSortHelper(arr,0,end-1);
    }
}
