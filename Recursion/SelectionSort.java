package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr={1,3,5,2,4,7,6};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    static int [] selectionSort(int [] arr){
        return selectionSortHelper(arr,0,arr.length-1,0);
    }
    static int[] selectionSortHelper(int [] arr, int start ,int end ,int tempIndex){
        if (end<0) return arr;
        if (start<=end){
            if (arr[start]>arr[tempIndex]) return selectionSortHelper(arr,start+1,end,start);
            return selectionSortHelper(arr,start+1,end,tempIndex);
        }
        int temp=arr[end];
        arr[end]=arr[tempIndex];
        arr[tempIndex]=temp;
        return selectionSortHelper(arr,0,end-1,0);
    }
}
