package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={-40,10,40,30,-2,45,66,1,2};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    static int[] selectionSort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            int smallestNumberIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[smallestNumberIndex]>=arr[j]){
                    smallestNumberIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallestNumberIndex];
            arr[smallestNumberIndex]=temp;
        }
        return arr;
    }
}
