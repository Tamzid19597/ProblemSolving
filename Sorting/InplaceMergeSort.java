package Sorting;

import java.util.Arrays;

public class InplaceMergeSort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        mergeSortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInplace(int [] arr,int start,int end){
        if (end-start==1) return;
        int mid=(start+end)/2;
        mergeSortInplace(arr,start,mid);
        mergeSortInplace(arr,mid,end);
        mergeInplace(arr,start,mid,end);
    }
    static void mergeInplace(int[]arr,int sFirst,int mid,int eSecond){
        int [] mergedArray=new int[eSecond-sFirst];
        int i=sFirst;
        int j=mid;
        int k=0;
        while (i<mid&& j<eSecond){
            if (arr[i]<arr[j]){
                mergedArray[k]=arr[i];
                i++;
                k++;
            }
            else {
                mergedArray[k]=arr[j];
                j++;
                k++;
            }
        }
        while (i< mid){
            mergedArray[k]=arr[i];
            i++;
            k++;
        }
        while (j< eSecond){
            mergedArray[k]=arr[j];
            j++;
            k++;
        }
        for (int l=0;l< mergedArray.length;l++){
            arr[sFirst+l]=mergedArray[l];
        }
    }
}
