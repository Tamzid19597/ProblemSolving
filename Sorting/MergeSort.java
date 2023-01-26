package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,5};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int [] arr){
        if (arr.length==1) return arr;
        int mid= arr.length/2;
        int [] first=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] second=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(first,second);
    }
    static int[] merge(int[]first,int[]second){
        int[] mergedArr=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length && j<second.length){
            if (first[i]<second[j]){
                mergedArr[k]=first[i];
                i++;
                k++;
            }
            else {
                mergedArr[k]=second[j];
                j++;
                k++;
            }
        }
        while (i< first.length){
            mergedArr[k]=first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mergedArr[k]=second[j];
            j++;
            k++;
        }
        return mergedArr;
    }

}
