package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr={-20,3,0,5,6,7,8,10,1,2,2,2,3,10};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    static int[] insertionSort(int[]arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i;j>0;j--){
                if (arr[j]<=arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }
}
